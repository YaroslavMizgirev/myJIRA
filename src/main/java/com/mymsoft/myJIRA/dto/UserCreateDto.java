package com.mymsoft.myJIRA.dto;

import lombok.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class UserCreateDto {

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email must be a valid email address")
    @EqualsAndHashCode.Include
    @ToString.Include
    @NonNull
    private String email;

    @NotBlank(message = "Username cannot be blank")
    @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
    @EqualsAndHashCode.Include
    @ToString.Include
    @NonNull
    private String username;

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    @NonNull
    private String password;
}