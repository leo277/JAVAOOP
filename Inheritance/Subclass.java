package Inheritance;
//The program given in this section demonstrates how to use the super keyword to invoke the 
//parametrized constructor of the superclass. 

public class Subclass extends Superclass{
	Subclass(int age){
		super(age);
	}
	
	public static void main(String args[]){
		Subclass s = new Subclass(24);
		s.getAge();
	}
}

class Superclass{
	int age;
	
	Superclass(int age){
		this.age = age;
	}
	
	public void getAge(){
		System.out.println("The value of the variable named age in super class is: "+age);
	}
}

