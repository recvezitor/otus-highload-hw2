package com.dimas.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

import java.time.LocalDate;

@With
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonCreate {
    private String firstName;
    private String secondName;
    private LocalDate birthdate;
    private String biography;
    private String city;
    private String password;

}
