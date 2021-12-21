package ExceptionHandling;

public class Throws {
	static void display() throws ArithmeticException {
		int a = 10 / 0;
		System.out.println("this is throws block");
	}

	public static void main(String[] args) {
try {
	display();
	}
catch(ArithmeticException e) {
	System.out.println(e.toString());
}
System.out.println("exception handled");
}
}
