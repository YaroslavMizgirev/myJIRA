package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "issue_link_types",
    uniqueConstraints = {
        @UniqueConstraint(name = "uk_issue_link_types_name", columnNames = {"name"}),
        @UniqueConstraint(name = "uk_issue_link_types_inward_name", columnNames = {"inward_name"})
    })
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id", "name", "inwardName"})
public class IssueLinkType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "inward_name", nullable = false, length = 100)
    private String inwardName;
}