package com.ricardo.bookstore.service.exceptions;


/**
 * 
 * @author ricardo.baccarini
 * Gerei os construtores da super classe RuntimeException
 */
public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ObjectNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
