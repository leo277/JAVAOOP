package Inheritance;

public class Cat extends Mammals{
	public static void main(String args[]){
		Mammals m = new Mammals();
		Cat d = new Cat();
		
		System.out.println(m instanceof Animals);
		System.out.println(d instanceof Mammals);
		System.out.println(d instanceof Animals);
	}
}

interface Animals{}

class Mammals implements Animals{}

