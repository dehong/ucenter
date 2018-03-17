package com.dehong.sso.core.exception;

public class DBConcurrencyException extends RuntimeException {
	
	private static final long serialVersionUID = -3640879085846446887L;
	
	public DBConcurrencyException(){}
	
	public DBConcurrencyException(String message){
		super(message);
	}
	
	public DBConcurrencyException(Throwable cause){
		super(cause);
	}
	
	public DBConcurrencyException(String message, Throwable cause){
		super(message, cause);
	}
	
}
