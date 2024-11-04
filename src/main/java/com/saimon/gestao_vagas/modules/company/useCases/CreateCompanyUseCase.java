package com.saimon.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saimon.gestao_vagas.exception.UserFondException;
import com.saimon.gestao_vagas.modules.company.entities.CompanyEntity;
import com.saimon.gestao_vagas.modules.company.repositores.ComponyRepository;


@Service
public class CreateCompanyUseCase {


    @Autowired
    private ComponyRepository componyRepository;
    
    public CompanyEntity execute(CompanyEntity companyEntity){

        this.componyRepository
                    .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                    .ifPresent((User)->{
                        throw  new UserFondException();
                    });

                    return  this.componyRepository.save(companyEntity);
                }
}
