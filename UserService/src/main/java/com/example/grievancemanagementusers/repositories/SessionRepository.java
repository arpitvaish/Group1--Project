package com.example.grievancemanagementusers.repositories;

import com.example.grievancemanagementusers.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SessionRepository extends JpaRepository<Session, UUID> {
    Optional<Session> findByToken(String token);
    Optional<Session> findByTokenAndUser_Id(String token, UUID userId);
}
