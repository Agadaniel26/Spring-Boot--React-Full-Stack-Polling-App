package com.tochukwu.polls.repository;

import com.tochukwu.polls.model.Role;
import com.tochukwu.polls.model.RoleName;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository {
    Optional<Role> findByName(RoleName roleName);
}
