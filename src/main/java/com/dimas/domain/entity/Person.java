package com.dimas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.With;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


@With
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Person {

    @EqualsAndHashCode.Include
    private UUID id;
    private String firstName;
    private String secondName;
    private LocalDate birthdate;
    private String biography;
    private String city;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
