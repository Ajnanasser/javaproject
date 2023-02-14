package oops;

public class Polymorphism_overloading {

	public static void main(String[] args) {
		Polymorphism_overloading p=new Polymorphism_overloading();
		p.add();
		p.add(50,40);
		p.add(3, 6.7);
		p.add(8.6,5);

	}
	public void add()
	{
		int a=20,b=30;
		int c=a+b;
		System.out.println(c);
	}
public void add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void add(int a,double b)
{
	double c=a+b;
	System.out.println(c);
}
public void add(double a,int b)
{
	double c=a+b;
	System.out.println(c);
}
}
