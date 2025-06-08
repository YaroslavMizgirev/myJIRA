package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "file_types",
    uniqueConstraints = {
        @UniqueConstraint(name = "uk_file_types_extension", columnNames = {"extension"}),
        @UniqueConstraint(name = "uk_file_types_mime_type", columnNames = {"mime_type"}),
    })
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id", "extension", "mimeType"})
public class FileType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "extension", nullable = false, length = 20)
    private String extension;

    @Column(name = "mime_type", nullable = false, length = 100)
    private String mimeType;
}