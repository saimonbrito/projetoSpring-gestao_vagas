

package com.saimon.gestao_vagas.modules.canditate.userCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saimon.gestao_vagas.exception.UserFondException;
import com.saimon.gestao_vagas.modules.canditate.controllers.CandidateEntity;
import com.saimon.gestao_vagas.modules.canditate.controllers.CandidateRepository;

@Service
public class createCandidateUserCase {
    

    @Autowired
    private CandidateRepository candidateRepository;
    
    public CandidateEntity execute(CandidateEntity candidateEntity){

        this.candidateRepository
                    .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                    .ifPresent((User)->{
                        throw  new UserFondException();
                    });

                    return  this.candidateRepository.save(candidateEntity);
        
    }
}
