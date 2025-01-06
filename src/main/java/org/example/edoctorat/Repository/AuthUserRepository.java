package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthUserRepository extends JpaRepository<AuthUser, Integer> {
    List<AuthUser> findByUsername(String username);
}
