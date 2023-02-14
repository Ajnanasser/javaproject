package oops;


class A1
{
	public void display()
	{
		System.out.println("A details");
	}
}
class B1 extends A1
{
	public void details()
	{
		System.out.println("B detais");
	}
}
class C extends B1
{
	public void cdetails()
	{
		System.out.println("c details");
	}
}
public class Multilevelinherit {

	public static void main(String[] args) {
		C ob=new C();
		ob.cdetails();
		ob.details();
		ob.display();
		B1 ob1=new B1();
		ob1.details();
		ob1.display();
		

	}

}
