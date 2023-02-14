package oops;


abstract class calc
{
	abstract public void add();  //focus on main thing.logic apply on the inheritant class
	abstract public void sub();
	public void mul()
	{
		System.out.println("MULTIPLICATION");
	}
}
class Calcoperation extends calc
{

	@Override
	public void add() {
		System.out.println("ADD");
		
	}

	@Override
	public void sub() {
		System.out.println("SUBTRACTION");
		
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		Calcoperation c=new Calcoperation();
		c.add();
		c.sub();
		c.mul();

	}

}
