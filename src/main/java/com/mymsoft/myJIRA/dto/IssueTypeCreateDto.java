package com.mymsoft.myJIRA.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"})
public class IssueTypeCreateDto {
    @NotBlank(message = "Название типа задачи не может быть пустым")
    @Size(max = 50, message = "Название типа задачи не должно превышать 50 символов")
    private String name;

    @Size(max = 255, message = "URL иконки не должен превышать 255 символов")
    private String iconUrl;

    @Size(max = 7, message = "Код цвета должен быть в формате #RRGGBB (7 символов)")
    private String colorHexCode;
}