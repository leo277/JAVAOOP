package Inheritance;

public class Dog extends Mammal{
	public static void main(String args[]){
		@SuppressWarnings("unused")
		Animal a = new Animal();
		Mammal m = new Mammal();
		Dog d = new Dog();
		
		System.out.println(m instanceof Animal);
		System.out.println(d instanceof Mammal);
		System.out.println(d instanceof Animal);
	}
}

class Mammal extends Animal{
}

class Reptile extends Animal{
}

class Animal{	
}