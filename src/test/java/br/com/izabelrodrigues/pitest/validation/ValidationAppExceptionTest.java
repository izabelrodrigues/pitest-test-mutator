/**
 *
 */
package br.com.izabelrodrigues.pitest.validation;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Izabel Rodrigues
 *
 */

class ValidationAppExceptionTest {

	@Test
	void validaErroCode() {

		int erroCode = 001;
		ValidationAppException validationAppException = new ValidationAppException(001, "TESTE");

		assertEquals(erroCode, validationAppException.getErrorCode());
	}


}
