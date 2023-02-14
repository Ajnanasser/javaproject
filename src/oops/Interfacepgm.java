package oops;

interface Animal1
{
	void sleep1();
	public void eat();
}
interface pet
{
	public void petdetails();
}
class Dog1 implements Animal1,pet
{

	@Override
	public void sleep1() {
		System.out.println("sleep");
		
	}

	@Override
	public void eat() {
		System.out.println("eat");
		
	}

	@Override
	public void petdetails() {
		System.out.println("petdetails");
		
	}

	
	
}
class Cat1 implements Animal1,pet
{

	@Override
	public void petdetails() {
		System.out.println("cat");
		
	}

	@Override
	public void sleep1() {
		System.out.println("catsleep");
		
	}

	@Override
	public void eat() {
		System.out.println("cat eat");
		
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		Animal1 ob= new Dog1();  //if we create object using interface we can access same reference name in different class
		ob.eat();
		ob.sleep1();
		//ob.petdetails();
		
		 ob=new Cat1();
		ob.eat();
		ob.sleep1();
		//ob.petdetails();
	
		
		

	}

}
