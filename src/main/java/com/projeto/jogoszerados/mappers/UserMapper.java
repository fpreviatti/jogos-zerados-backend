package com.projeto.jogoszerados.mappers;


import com.projeto.jogoszerados.dtos.SignUpDto;
import com.projeto.jogoszerados.dtos.UserDto;
import com.projeto.jogoszerados.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "pass", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}
