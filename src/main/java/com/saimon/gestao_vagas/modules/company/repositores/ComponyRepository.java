package com.saimon.gestao_vagas.modules.company.repositores;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saimon.gestao_vagas.modules.company.entities.CompanyEntity;


public interface  ComponyRepository extends JpaRepository<CompanyEntity, UUID>{


    Optional<CompanyEntity> findByUsernameOrEmail(String username,String email);


}
