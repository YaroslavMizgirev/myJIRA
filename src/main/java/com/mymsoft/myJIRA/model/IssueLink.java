package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "issue_links",
    uniqueConstraints = {
        @UniqueConstraint(name = "uk_issue_links_unique_pair1", columnNames = {"source_issue_id", "target_issue_id", "link_type_id"}),
    })
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id", "sourceIssue", "targetIssue", "linkType", "createdAt"})
public class IssueLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_issue_id", nullable = false)
    private Issue sourceIssue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "target_issue_id", nullable = false)
    private Issue targetIssue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "link_type_id", nullable = false)
    private IssueLinkType linkType;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;
}