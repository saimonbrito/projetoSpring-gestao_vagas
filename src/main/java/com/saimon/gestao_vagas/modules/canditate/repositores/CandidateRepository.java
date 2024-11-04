package com.saimon.gestao_vagas.modules.canditate.repositores;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saimon.gestao_vagas.modules.canditate.entities.CandidateEntity;

public interface  CandidateRepository extends JpaRepository<CandidateEntity, UUID> {
    
    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);

}
