package com.saimon.gestao_vagas.modules.company.repositores;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saimon.gestao_vagas.modules.company.entities.JobEntity;

public interface jobRepositoty extends JpaRepository<JobEntity, UUID>{

}
