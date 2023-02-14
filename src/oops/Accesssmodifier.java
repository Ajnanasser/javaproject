package oops;

class p
{
	private int a=30; //private access modifier cannot access anywhere
	int b=36; //default can access anywhere
	void add()   //default method
	{
		System.out.println("add");
	}
}

public class Accesssmodifier {
	protected int c=50;  //access outside pkg and inheritant
	public static void main(String[] args) {
		p ob=new p();
		ob.add();
		System.out.println(ob.b);

	}

}
