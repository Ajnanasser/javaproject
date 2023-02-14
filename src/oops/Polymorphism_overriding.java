package oops;

class Parent
{
	public void parentdetails()
	{
		System.out.println("parent");
	}
}
class Child extends Parent
{

	@Override
	public void parentdetails() {
		System.out.println("child");
		super.parentdetails();
	}
	
}
public class Polymorphism_overriding { 

	public static void main(String[] args) {
		Child c=new Child();
		c.parentdetails();

	}
	

}
