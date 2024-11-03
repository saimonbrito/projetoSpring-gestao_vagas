package com.saimon.gestao_vagas.exception;



public class UserFondException extends RuntimeException{
    public UserFondException(){
        super("usuario existente");
    }

}
