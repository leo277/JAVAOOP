package Overriding;

public class TestDog {
	public static void main(String args[]){
		Animal a = new Animal(); //animal reference animal object
		Animal b = new Dog(); //animal reference, dog object
		a.move();//run animal commnad
		b.move();//run dog command
	}
}

class Animal{
	public void move(){
		System.out.println("Animals can move");
	}
}

class Dog extends Animal{
	public void move(){
		//super.move(); //invoke move from Animal superclass
		System.out.println("Dogs can walk and run");
	}
}