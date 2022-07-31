/**
 *
 */
package br.com.izabelrodrigues.pitest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.izabelrodrigues.pitest.validation.ValidationAppException;

/**
 * @author Izabel Rodrigues
 *
 */

class CalculoTest {

	@Test
	void validaSaidaCalculoAQuandoAmbasEntradasSaoPositivas() throws ValidationAppException {

		int inputA = 3;
		int inputB = 2;

		int calculoA = Calculo.efetuaCalculo(inputA, inputB);

		assertEquals(6, calculoA, "Deveria ser o resultado da soma dos inputs e ao final incrementar uma unidade");
		assertNotEquals(4, calculoA);
		assertNotEquals(3, calculoA);
		assertNotEquals(1, calculoA);

		int inputA1 = 2;
		int inputB1 = 4;

		int calculoA1 = Calculo.efetuaCalculo(inputA1, inputB1);

		assertEquals(7, calculoA1, "Deveria ser o resultado da soma dos inputs e ao final incrementar uma unidade");


	}

	@Test
	void validaSaidaQuandoPossuiPeloMenosUmValorZerado() throws ValidationAppException {
		int inputA = 2;
		int inputB = 0;

		int calculoA = Calculo.efetuaCalculo(inputA, inputB);
		assertEquals(3, calculoA, "Deveria ser o valor de A + 1");
		Assertions.assertDoesNotThrow(() -> Calculo.efetuaCalculo(2, 0));

		inputA = 0;
		inputB = 3;

		calculoA = Calculo.efetuaCalculo(inputA, inputB);

		assertEquals(4, calculoA, "Deveria ser o valor de B + 1");
		assertNotEquals(0, calculoA);

	}

	@Test
	void validaSaidaQuandoAmbosInputsForemZerados() throws ValidationAppException {

		int inputC = 0;
		int inputD = 0;

		int calculoA1 = Calculo.efetuaCalculo(inputC, inputD);

		assertEquals(0, calculoA1, "Deveria ser zero");
		assertNotEquals(1, calculoA1);
		Assertions.assertDoesNotThrow(() -> Calculo.efetuaCalculo(inputC, inputD));
	}

	@Test
	void validaExcecaoQuandoOCalculoPosssuiEntradaNegativa() {


		ValidationAppException exceptionANegativo = Assertions.assertThrows(ValidationAppException.class, () -> Calculo.efetuaCalculo(-1, 60));
		assertEquals("Não é permitido entradas negativas para o cálculo!", exceptionANegativo.getMessage());
		assertEquals(001, exceptionANegativo.getErrorCode(), "Deveria ter o código de erro 001");


		ValidationAppException exceptionBNegativo = Assertions.assertThrows(ValidationAppException.class, () -> Calculo.efetuaCalculo(35, -1));
		assertEquals("Não é permitido entradas negativas para o cálculo!", exceptionBNegativo.getMessage());
		assertEquals(001, exceptionBNegativo.getErrorCode(), "Deveria ter o código de erro 001");

		ValidationAppException exceptionBNegativoAzero = Assertions.assertThrows(ValidationAppException.class, () -> Calculo.efetuaCalculo(0, -1));
		assertEquals("Não é permitido entradas negativas para o cálculo!", exceptionBNegativoAzero.getMessage());
		assertEquals(001, exceptionBNegativoAzero.getErrorCode(), "Deveria ter o código de erro 001");

		ValidationAppException exceptionBZerAneg = Assertions.assertThrows(ValidationAppException.class, () -> Calculo.efetuaCalculo(-1, 0));
		assertEquals("Não é permitido entradas negativas para o cálculo!", exceptionBZerAneg.getMessage());
		assertEquals(001, exceptionBZerAneg.getErrorCode(), "Deveria ter o código de erro 001");


		ValidationAppException exceptionAmbosNeg = Assertions.assertThrows(ValidationAppException.class, () -> Calculo.efetuaCalculo(-1, -2));
		assertEquals("Não é permitido entradas negativas para o cálculo!", exceptionAmbosNeg.getMessage());
		assertEquals(001, exceptionAmbosNeg.getErrorCode(), "Deveria ter o código de erro 001");
	}
}
