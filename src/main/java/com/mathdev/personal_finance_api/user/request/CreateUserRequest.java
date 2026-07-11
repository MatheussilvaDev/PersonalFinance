package com.mathdev.personal_finance_api.user.request;


import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

    @NotNull(message = "O nome do usuário não pode ser nulo")
    private String name;

    @NotNull(message = "O e-mail do usuário não pode ser nulo")
    @Email(message = "E-mail inválido")
    private String email;

    @NotNull(message = "O nome do usuário não pode ser nulo")
    private String password;

}
