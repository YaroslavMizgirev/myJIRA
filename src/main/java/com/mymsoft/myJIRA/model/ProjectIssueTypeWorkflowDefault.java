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
@EqualsAndHashCode(of = {"project", "issueType", "workflow"})
@IdClass(ProjectIssueTypeWorkflowDefault.ProjectIssueTypeWorkflowDefaultId.class)
public class ProjectIssueTypeWorkflowDefault {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_type_id", nullable = false)
    private IssueType issueType;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workflow_id", nullable = false)
    private Workflow workflow;

    // Composite primary key class
    @Getter
    @Setter
    @RequiredArgsConstructor
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = {"project", "issueType", "workflow"})
    public static class ProjectIssueTypeWorkflowDefaultId implements Serializable {
        private Long project;
        private Long issueType;
        private Long workflow;
    }
}