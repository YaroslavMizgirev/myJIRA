package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable; // For composite primary key

@Entity
@Table(name = "issue_watchers")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"issue", "user"})
@IdClass(IssueWatcher.IssueWatcherId.class) // Define composite primary key class
public class IssueWatcher {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id", nullable = false)
    private Issue issue;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Composite primary key class
    @Getter
    @Setter
    @RequiredArgsConstructor
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = {"issue", "user"})
    public static class IssueWatcherId implements Serializable {
        private Long issue;
        private Long user;
    }
}