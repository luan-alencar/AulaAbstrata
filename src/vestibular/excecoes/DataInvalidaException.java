package vestibular.excecoes;

public class DataInvalidaException extends RuntimeException {
	public DataInvalidaException(String str) {
		super("A data " + str + " é inválida");
	}
}
