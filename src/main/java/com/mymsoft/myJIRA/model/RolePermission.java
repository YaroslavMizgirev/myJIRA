package com.mymsoft.myJIRA.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable; // For composite primary key

@Entity
@Table(name = "role_permissions")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"role", "permission"})
@IdClass(RolePermission.RolePermissionId.class) // Define composite primary key class
public class RolePermission {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "permission_id", nullable = false)
    private Permission permission;

    // Composite primary key class
    @Getter
    @Setter
    @RequiredArgsConstructor
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = {"role", "permission"})
    public static class RolePermissionId implements Serializable {
        private Long role;
        private Long permission;
    }
}