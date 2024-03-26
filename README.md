# hw2

* монолит
* реактивщина
* без ОРМ
* добавлены индексы к полям для поиска

### install

mvn clean install
docker build -f docker/Dockerfile.jvm -t otus-highload-hw1-reactive:latest .
docker images

### launch

all together:
- cd docker
- docker compose up

force update
docker-compose pull
docker-compose up --force-recreate --build -d
docker image prune -f


via IDEA:
DB_USERNAME=postgres;DB_URL=jdbc:postgresql://localhost:5432/postgres;DB_PASSWORD=postgres;
-Dquarkus.profile=prod

via docker:
docker run -i --rm -p 8080:8080 -e DB_URL=jdbc:postgresql://host.docker.internal:5432/postgres -e DB_USERNAME=postgres -e DB_PASSWORD=postgres otus-highload-hw1-reactive:latest

### publish
docker tag otus-highload-hw1-reactive:latest recvezitor/otus-highload-hw1-reactive:latest
docker login -> recvezitor/password
docker push recvezitor/otus-highload-hw1-reactive:latest

### pool
SHOW max_connections;
SELECT sum(numbackends) FROM pg_stat_database;

### TODO
- использовать uuid с сортировкой