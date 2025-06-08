package com.mymsoft.myJIRA.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id", "name"})
public class IssueTypeResponseDto {
    private Long id;
    private String name;
    private String iconUrl;
    private String colorHexCode;
}
