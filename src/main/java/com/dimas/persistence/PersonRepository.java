package com.dimas.persistence;

import com.dimas.domain.entity.Person;
import com.dimas.exception.NotFoundJdbcException;
import io.smallrye.mutiny.Uni;
import io.vertx.mutiny.pgclient.PgPool;
import io.vertx.mutiny.sqlclient.Row;
import io.vertx.mutiny.sqlclient.Tuple;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.dimas.util.Const.SCHEMA_NAME;

@Slf4j
@RequiredArgsConstructor
@ApplicationScoped
public class PersonRepository {

    private final PgPool pgPool;

    public Uni<Person> create(Person request) {
        log.info("persisting request person={}", request);
        return pgPool.withTransaction(conn -> conn.preparedQuery("""
                        INSERT INTO %s.person (first_name, second_name, birthdate, biography, city, created_at, password)
                                    VALUES ($1, $2, $3, $4, $5, $6, $7)
                                    RETURNING id
                        """.formatted(SCHEMA_NAME))
                .execute(map(request))
                .flatMap(rowSet -> {
                    var entity = request.withId(rowSet.iterator().next().getUUID("id"));
                    return Uni.createFrom().item(entity);
                })
        );
    }


    public Uni<Person> getById(UUID id) {
        return findById(id)
                .onItem().ifNull().failWith(() -> new NotFoundJdbcException("Person not found for id='%s'".formatted(id)));
    }

    public Uni<Person> findById(UUID id) {
        final var query = """
                 select * from %s.person where id = $1 LIMIT 1
                """.formatted(SCHEMA_NAME);
        return pgPool.preparedQuery(query)
                .execute(Tuple.tuple().addUUID(id))
                .onItem().transformToUni(rowSet -> {
                    for (Row row : rowSet) {
                        return Uni.createFrom().item(map(row));//return first item
                    }
                    return Uni.createFrom().nullItem();
                });
    }

    public Uni<Person> getByName(String name) {
        return findByName(name)
                .onItem().ifNull().failWith(() -> new NotFoundJdbcException("Person not found for name='%s'".formatted(name)));
    }

    public Uni<Person> findByName(String name) {
        final var query = """
                select * from %s.person where first_name = $1  LIMIT 1
                """.formatted(SCHEMA_NAME);
        return pgPool.preparedQuery(query)
                .execute(Tuple.tuple().addString(name))
                .onItem().transformToUni(rowSet -> {
                    for (Row row : rowSet) {
                        return Uni.createFrom().item(map(row));//return first item
                    }
                    return Uni.createFrom().nullItem();
                });
    }

    public Uni<List<Person>> search(String firstName, String lastName) {//warn, no paging
        final var query = """
                select * from %s.person where first_name ILIKE $1 AND second_name ILIKE $2 LIMIT 100
                """.formatted(SCHEMA_NAME);
        return pgPool.preparedQuery(query)
                .execute(Tuple.tuple()
                        .addString(firstName.toLowerCase() + "%")
                        .addString(lastName.toLowerCase() + "%")
                )
                .onItem().transformToUni(rowSet -> {
                    List<Person> result = new ArrayList<>();
                    for (Row row : rowSet) {
                        result.add(map(row));
                    }
                    return Uni.createFrom().item(result);
                });
    }

    private Person map(Row row) {
        return Person.builder()
                .id(row.getUUID("id"))
                .firstName(row.getString("first_name"))
                .secondName(row.getString("second_name"))
                .birthdate(row.getLocalDate("birthdate"))
                .biography(row.getString("biography"))
                .city(row.getString("city"))
                .createdAt(row.getLocalDateTime("created_at"))
                .updatedAt(row.getLocalDateTime("updated_at"))
                .password(row.getString("password"))
                .build();
    }

    private Tuple map(Person request) {
        return Tuple.tuple()
                .addString(request.getFirstName())
                .addString(request.getSecondName())
                .addLocalDate(request.getBirthdate())
                .addString(request.getBiography())
                .addString(request.getCity())
                .addLocalDateTime(LocalDateTime.now())
                .addString(request.getPassword());
    }

    public Uni<Integer> findByCity(String city) {
        final var query = """
                select count(*) from %s.person where city = $1
                """.formatted(SCHEMA_NAME);
        return pgPool.preparedQuery(query)
                .execute(Tuple.tuple().addString(city))
                .onItem().transformToUni(rowSet -> {
                    for (Row row : rowSet) {
                        return Uni.createFrom().item(row.getInteger("count"));
                    }
                    return Uni.createFrom().nullItem();
                });
    }

}
