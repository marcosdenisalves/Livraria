package br.com.caelum.livraria.services.exceptions;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class LivrariaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

}
