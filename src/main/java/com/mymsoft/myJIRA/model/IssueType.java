package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "issue_types",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_issue_types_name", columnNames = {"name"}),
        })
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class IssueType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    @EqualsAndHashCode.Include
    private String name;

    @Column(name = "icon_url")
    private String iconUrl;

    @Column(name = "color_hex_code", length = 7)
    private String colorHexCode;
}
