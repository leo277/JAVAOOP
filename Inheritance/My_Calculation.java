package Inheritance;

public class My_Calculation extends Calculation{
	public void multiplication(int x, int y){
		z = x*y;
		System.out.println("The product of the given nubmers:" + z);
	}
	
	public static void main(String args[]){
		int a = 20, b=10;
		My_Calculation demo = new My_Calculation();
		demo.addition(a, b);
		demo.Substraction(a,b);
		demo.multiplication(a, b);
		
		//declare using a super class reference variable
		Calculation cal = new My_Calculation();
		cal.addition(a, b);
		cal.Substraction(a, b);
		//cal.multiplication(a, b);//super class cannot call methods from subclass
	}
}

class Calculation{
	int z;
	public void addition(int x, int y){
		z=x+y;
		System.out.println("The sum of the given numbers:" +z);
	}
	
	public void Substraction(int x, int y){
		z= x-y;
		System.out.println("The difference betweent the given nubmers:" +z);
	}
}
