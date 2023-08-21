package Methods;

public class Multiply {

	public int multiplyTwoVar(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public double twoDatatype(int a, double b) {
		double multiply = a * b;
		return multiply;
	}
	
	public String empGetInfo(String name,int bonusAmt) {
		System.out.println("emp Salary");
		return name+bonusAmt;
	}
	public int getNumber() {
		System.out.println("Hi");
	    return 100;
	}

	public static void main(String[] args) {

		Multiply m1 = new Multiply();

		int mul = m1.multiplyTwoVar(2, 10);
		System.out.println(mul);

		double multiply = m1.twoDatatype(2, 2.2);
		System.out.println(multiply);
		
		String empName=m1.empGetInfo("Amit", 20);
		System.out.println(empName);
		
		int number=m1.getNumber();
		System.out.println(number);

	}

}
