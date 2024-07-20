package com.luccas71.dscatalog.resources.exceptions;

import com.luccas71.dscatalog.services.exceptions.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

//vai capturar e tratar erros ocorridos no controller
@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(EntityNotFoundException e, HttpServletRequest request){

        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(e.getMessage());
        err.setError("Resource not found");
        err.setPath(request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}
