package entities;

public class Student {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	
	public void aprovation() {
		if(finalGrade() > 60) {
			System.out.printf("FINAL GRADE = %.2f%n",finalGrade());
			System.out.println("PASS");
		}
		else {
			System.out.printf("FINAL GRADE = %.2f%n",finalGrade());
			double failed = 60 - finalGrade();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", failed); 
		}
	}
}
