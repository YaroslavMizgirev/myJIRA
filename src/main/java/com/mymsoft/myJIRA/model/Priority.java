package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "priorities",
    uniqueConstraints = {
            @UniqueConstraint(name = "uk_priorities_level", columnNames = {"level"}),
            @UniqueConstraint(name = "uk_priorities_name", columnNames = {"name"}),
    })
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Priority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "level", nullable = false)
    @EqualsAndHashCode.Include
    private Integer level;

    @Column(name = "name", nullable = false, length = 50)
    @EqualsAndHashCode.Include
    private String name;

    @Column(name = "icon_url")
    private String iconUrl;

    @Column(name = "color_hex_code", length = 7)
    private String colorHexCode;
}