package io.ngatale.employee_authentication.Repository;

import io.ngatale.employee_authentication.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findRolesById(Integer roleId);
}