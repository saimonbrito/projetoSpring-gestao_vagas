package com.saimon.gestao_vagas.modules.canditate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saimon.gestao_vagas.modules.canditate.userCase.createCandidateUserCase;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private createCandidateUserCase createCandidateUserCase;
    
    @PostMapping("/")
    public ResponseEntity<Object> create( @Valid @RequestBody CandidateEntity candidateEntity){

        
         try {
            var result = this.createCandidateUserCase.execute(candidateEntity);

            return ResponseEntity.ok().body(result);
         } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
         }
    }
}
