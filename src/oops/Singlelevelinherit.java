package oops;


class A
{
	public void display()
	{
		System.out.println("A details");
	}
}
class B extends A
{
	public void details()
	{
		System.out.println("B details");
	}
}
public class Singlelevelinherit {

	public static void main(String[] args) {
		B b=new B();
		b.details();
		b.display();

	}

}
