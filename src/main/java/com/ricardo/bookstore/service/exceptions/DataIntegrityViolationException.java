package com.ricardo.bookstore.service.exceptions;

public class DataIntegrityViolationException extends RuntimeException {

	public DataIntegrityViolationException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DataIntegrityViolationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

}
