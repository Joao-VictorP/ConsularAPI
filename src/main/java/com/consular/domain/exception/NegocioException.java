package com.consular.domain.exception;

public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = -2217715828492423180L;

	public NegocioException(String message) {
		super(message);
	}
}
