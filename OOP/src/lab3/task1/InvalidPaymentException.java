package lab3.task1;

public class InvalidPaymentException extends Exception {
	public InvalidPaymentException() {
		
	}
	
	public InvalidPaymentException(String message) {
		super(message);
	}
}
