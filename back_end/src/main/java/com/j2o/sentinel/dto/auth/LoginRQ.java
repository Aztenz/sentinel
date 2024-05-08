package com.j2o.sentinel.dto.auth;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRQ {
    private static final String USERNAME_IS_MANDATORY = "username is mandatory";
    private static final String PASSWORD_IS_MANDATORY = "password is mandatory";
    private static final String USERNAME_REGEX = "^[a-zA-Z][a-zA-Z0-9]*$";
    @Valid

    @NotNull(message = USERNAME_IS_MANDATORY)
    @NotBlank(message = USERNAME_IS_MANDATORY)
    @Pattern(regexp = USERNAME_REGEX)
    private String username;

    @NotNull(message = PASSWORD_IS_MANDATORY)
    @NotBlank(message = PASSWORD_IS_MANDATORY)
    private String password;
}
