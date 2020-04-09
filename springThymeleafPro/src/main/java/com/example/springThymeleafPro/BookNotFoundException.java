package com.example.springThymeleafPro;

public class BookNotFoundException  extends RuntimeException{
	{
		public BookNotFoundException(String message,Throwble cause){
			super(message,cause);
		}
}

} 
