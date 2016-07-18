package Polymorphism;

public class VirtualDemo{
// import Employee.java;
// import Salary.java;
	public static void main(String [] args){
		Salary s = new Salary("yonkgai", "blk 333",22, 1000.0);
		Employee e = new Salary("john", "bostin",33,2400.0);
		System.out.println("Call mailCheck using salary reference -- ");
		s.mailCheck();
		System.out.println("\n Call mailcheck using employee reference -- ");
		e.mailCheck();

		
		s.setSalary(20.0);
		//you can assign a subclass to its parent class
		e = s;
		System.out.println("After setting Salary to Employee reference");
		e.mailCheck();	
	}
}