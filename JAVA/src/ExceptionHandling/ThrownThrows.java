package ExceptionHandling;

public class ThrownThrows {
	void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligible to vote");
		}
		else {
			System.out.println("eligible for vote");
		}
	}

	public static void main(String[] args) {
		ThrownThrows obj=new ThrownThrows();
		obj.validate(19);
	}

}
