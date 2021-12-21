package Encapsulation;

class Emplyee_one {
	private String name;
	private String designation;
	private double sal;
	private int pin;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

public class Employee {
	
	
	public static void main(String[] args) {
		Emplyee_one obj=new Emplyee_one();
		obj.setName("ravi");
		obj.setDesignation("analyst");
		obj.setSal(20028.36);
		obj.setPin(505102);
		obj.setCity("warangal");
		System.out.println("employee name:"+obj.getName());
		System.out.println("emplyee designation:"+obj.getDesignation());
		System.out.println("employee salary:"+obj.getSal());
		System.out.println("employee pin:"+obj.getPin());
		System.out.println("employee city:"+obj.getCity());
	}

}
