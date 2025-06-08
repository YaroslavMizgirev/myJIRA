package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable; // For composite primary key

@Entity
@Table(name = "user_groups")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"user", "group"})
@IdClass(UserGroup.UserGroupId.class) // Define composite primary key class
public class UserGroup {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    // Composite primary key class
    @Getter
    @Setter
    @RequiredArgsConstructor
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = {"user", "group"})
    public static class UserGroupId implements Serializable {
        private Long user;
        private Long group;
    }
}