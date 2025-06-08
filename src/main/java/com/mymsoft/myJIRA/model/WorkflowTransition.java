package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "workflow_transitions",
    uniqueConstraints = {
        @UniqueConstraint(name = "uk_workflow_transitions_unique_pair1", columnNames = {"workflow_id", "name"}),
        @UniqueConstraint(name = "uk_workflow_transitions_unique_pair2", columnNames = {"workflow_id", "from_status_id", "to_status_id"}),
    })
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class WorkflowTransition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "name", nullable = false)
    @EqualsAndHashCode.Include
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_status_id", nullable = false)
    @EqualsAndHashCode.Include
    private IssueStatus fromStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_status_id", nullable = false)
    @EqualsAndHashCode.Include
    private IssueStatus toStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workflow_id", nullable = false)
    @EqualsAndHashCode.Include
    private Workflow workflow;
}