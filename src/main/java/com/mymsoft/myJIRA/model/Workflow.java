package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "workflows",
    uniqueConstraints = {
        @UniqueConstraint(name = "uk_workflows_name", columnNames = {"name"}),
    })
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Workflow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "is_default", nullable = false)
    @EqualsAndHashCode.Include
    private Boolean isDefault = false;

    @Column(name = "name", nullable = false)
    @EqualsAndHashCode.Include
    private String name;

    // Связь с WorkflowStatus
    @ManyToMany
    @JoinTable(
            name = "workflow_statuses",
            joinColumns = @JoinColumn(name = "workflow_id"),
            inverseJoinColumns = @JoinColumn(name = "status_id")
    )
    private Set<IssueStatus> statuses = new HashSet<>();

    // Связь с WorkflowTransition
    @OneToMany(mappedBy = "workflow", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<WorkflowTransition> transitions = new HashSet<>();
}