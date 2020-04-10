package com.example.springThymeleafPro;

public class BookNotFoundException extends RuntimeException{
		public BookNotFoundException(String message, Throwable cause){
			super(message,cause);
		}
}