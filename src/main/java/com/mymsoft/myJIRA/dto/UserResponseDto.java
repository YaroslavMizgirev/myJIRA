package com.mymsoft.myJIRA.dto;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class UserResponseDto {

    @EqualsAndHashCode.Include
    @ToString.Include
    @NonNull
    private Long id;

    @EqualsAndHashCode.Include
    @ToString.Include
    @NonNull
    private String email;

    @EqualsAndHashCode.Include
    @ToString.Include
    @NonNull
    private String username;

    @ToString.Include
    private Instant createdAt;

    @ToString.Include
    private Instant updatedAt;
}