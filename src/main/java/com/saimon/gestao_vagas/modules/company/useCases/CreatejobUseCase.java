package com.saimon.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saimon.gestao_vagas.modules.company.entities.JobEntity;
import com.saimon.gestao_vagas.modules.company.repositores.jobRepositoty;

@Service
public class CreatejobUseCase {

    @Autowired
    private jobRepositoty jobRepositoty;

    public JobEntity execute(JobEntity jobEntity){
        return this.jobRepositoty.save(jobEntity);
    }


}
