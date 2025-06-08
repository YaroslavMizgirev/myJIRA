package com.mymsoft.myJIRA.dto;

import lombok.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class UserUpdateDto {

    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @Email(message = "Email must be a valid email address")
    @EqualsAndHashCode.Include
    @ToString.Include
    private String email;

    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    @EqualsAndHashCode.Include
    @ToString.Include
    private String username;

    // Пароль может быть необязательным для обновления
    @Size(min = 8, message = "New password must be at least 8 characters long")
    private String newPassword;

    // Требуется старый пароль для подтверждения обновления
    private String oldPassword;
}