package excepciones;

public class BoundaryViolationException extends RuntimeException {
	public BoundaryViolationException(String msg) {
		super(msg);
	}
}
