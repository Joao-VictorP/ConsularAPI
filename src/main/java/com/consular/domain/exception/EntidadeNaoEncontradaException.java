package com.consular.domain.exception;


public class EntidadeNaoEncontradaException extends NegocioException {

	private static final long serialVersionUID = -762134424167074309L;

	public EntidadeNaoEncontradaException(String message) {
		super(message);
	}
}
