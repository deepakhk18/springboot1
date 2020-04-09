package com.example.springThymeleafPro;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvicevice
public class RestExceptionHandler {
	@ExceptionHandler({BookNotFoundException.class})
	protected ResponseEntity<Object> handelNotfound(
			Exception ex ,WebRequest request) {
		return handelExceptionInternal(ex,"Book not found",
				new HttpHeaders(),HttpStatus.NOT_FOUND,request);
	}
	@ExceptionHandler({BookIDmatchException.class,)ConstraintViolationException.class,
	DataIntegrityViolationException.class })
    public ResponseEntity<Object>handelBadRequest(
    		Exception ex,WebRequest request){
    	return handelExceptioninternal(ex,ex.getLocalizedMessage(),
    			new HttpHeaders(),HttpStatus.BAD_REQUEST,request);
	}

}
