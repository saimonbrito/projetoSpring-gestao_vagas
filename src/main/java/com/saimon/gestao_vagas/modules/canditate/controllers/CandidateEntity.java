package com.saimon.gestao_vagas.modules.canditate.controllers;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;


@Entity(name = "candidate")
public class CandidateEntity {


    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
    private UUID id ;

    private String name;

    @Pattern(regexp = "\\S+", message = "o campo [username nao deve  conter espaços]")
    private String username;

    @Email(message = " O compo [email] deve conter um e-mail valido")
    private String email;

    @Length(min= 10, max=100, message = "A senha deve conter entre (10 )e (100) caracteres" )
    private String password;

    private String description;

    private String curriculun;

    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCurriculun() {
        return curriculun;
    }
    public void setCurriculun(String curriculun) {
        this.curriculun = curriculun;
    }

    @CreationTimestamp
    private LocalDateTime createdAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
