package com.saimon.gestao_vagas.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandleController {

    private MessageSource messageSource;

    public ExceptionHandleController( MessageSource message){
        this.messageSource = message;
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErroMenssageDTO>> handlemethodArgumentNotValidException(MethodArgumentNotValidException e){
        
        List<ErroMenssageDTO> dto = new ArrayList<>();
        e.getBindingResult().getFieldErrors().forEach(err ->{
            String message = messageSource.getMessage(err,LocaleContextHolder.getLocale());
            ErroMenssageDTO error =  new ErroMenssageDTO(message, err.getField());
            dto.add(error);
        });
        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }
}
