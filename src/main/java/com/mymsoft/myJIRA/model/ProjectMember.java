package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable; // For composite primary key

@Entity
@Table(name = "project_members")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"project", "group", "role"})
@IdClass(ProjectMember.ProjectMemberId.class) // Define composite primary key class
public class ProjectMember {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    // Composite primary key class
    @Getter
    @Setter
    @RequiredArgsConstructor
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = {"project", "group", "role"})
    public static class ProjectMemberId implements Serializable {
        private Long project;
        private Long group;
        private Long role;
    }
}