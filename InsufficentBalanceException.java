package dec31;

public class InsufficentBalanceException extends Exception {
String message;

public InsufficentBalanceException(String message) {
	super();
	this.message = message;
}

@Override
public String toString() {
	return "InsufficentBalanceException [message=" + message + "]";
}
}
