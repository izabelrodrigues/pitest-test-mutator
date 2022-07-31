/**
 *
 */
package br.com.izabelrodrigues.pitest;

import br.com.izabelrodrigues.pitest.validation.ValidationAppException;

/**
 * @author Izabel Rodrigues
 *
 */

public class Calculo {

	private static final String MSG_ERRO_ENTRADAS_NEGATIVAS = "Não é permitido entradas negativas para o cálculo!";

	private Calculo() {
	}

	public static int efetuaCalculo(int inputA, int inputB) throws ValidationAppException {

		if (inputA < 0 || inputB < 0) {
			throw new ValidationAppException(001, MSG_ERRO_ENTRADAS_NEGATIVAS);
		}
		if (inputA > 0 && inputB > 0) {
			return (inputA + inputB) + 1;
		}

		if (inputA == 0 && inputB == 0) {
			return 0;
		}

		int maior = inputA;
		if (inputB > inputA) {
			maior = inputB;
		}
		return maior + 1;

	}

}
