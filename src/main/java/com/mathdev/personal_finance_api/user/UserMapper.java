package com.mathdev.personal_finance_api.user;

import com.mathdev.personal_finance_api.user.request.CreateUserRequest;
import com.mathdev.personal_finance_api.user.response.CreateUserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(CreateUserRequest request);
    CreateUserResponse toResponse(UserEntity entity);
}

