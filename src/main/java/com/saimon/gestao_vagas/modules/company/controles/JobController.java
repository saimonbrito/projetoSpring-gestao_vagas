package com.saimon.gestao_vagas.modules.company.controles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saimon.gestao_vagas.modules.company.entities.JobEntity;
import com.saimon.gestao_vagas.modules.company.useCases.CreatejobUseCase;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private CreatejobUseCase createjobUseCase;

    @PostMapping("/")
    public JobEntity create(@Valid @RequestBody JobEntity jobEntity){
        return this.createjobUseCase.execute(jobEntity);
    }

}
