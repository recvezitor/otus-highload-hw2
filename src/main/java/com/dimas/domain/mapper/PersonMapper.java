package com.dimas.domain.mapper;

import com.dimas.domain.PersonCreate;
import com.dimas.domain.entity.Person;
import com.dimas.openapi.model.ApiUser;
import com.dimas.openapi.model.ApiUserRegisterPostRequest;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import static org.mapstruct.MappingConstants.ComponentModel.JAKARTA;


@Mapper(componentModel = JAKARTA, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PersonMapper {

    ApiUser map(Person person);

    Person map(PersonCreate person);

    PersonCreate map(ApiUserRegisterPostRequest request);


}
