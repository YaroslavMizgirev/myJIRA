package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable; // For composite primary key

@Entity
@Table(name = "project_issue_type_workflow_defaults")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@IdClass(ProjectIssueTypeWorkflowDefault.ProjectIssueTypeWorkflowDefaultId.class)
public class ProjectIssueTypeWorkflowDefault {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    @EqualsAndHashCode.Include
    private Project project;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_type_id", nullable = false)
    @EqualsAndHashCode.Include
    private IssueType issueType;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workflow_id", nullable = false)
    @EqualsAndHashCode.Include
    private Workflow workflow;

    // Composite primary key class
    @Getter
    @Setter
    @RequiredArgsConstructor
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    public static class ProjectIssueTypeWorkflowDefaultId implements Serializable {
        @EqualsAndHashCode.Include
        private Long project;

        @EqualsAndHashCode.Include
        private Long issueType;

        @EqualsAndHashCode.Include
        private Long workflow;
    }
}