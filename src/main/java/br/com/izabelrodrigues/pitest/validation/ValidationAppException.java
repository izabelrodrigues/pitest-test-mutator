/**
 *
 */
package br.com.izabelrodrigues.pitest.validation;


/**
 * @author Izabel Rodrigues
 *
 */

public class ValidationAppException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -1498900965511894849L;

	private final int errorCode;

	public ValidationAppException(int errorCode, String mensagem) {
		super(mensagem);
		this.errorCode = errorCode;
	}

	public final int getErrorCode() {
		return errorCode;
	}

}
