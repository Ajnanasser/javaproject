package oops;

interface BasicAnimal
{
	public void eat();
	public void sleep();
}
class Monkey
{
	public void jump()
	{
		System.out.println("jump");
	}
	public  void bite()
	{
		System.out.println("bite");
	}
}
class Human extends Monkey implements BasicAnimal
{

	@Override
	public void eat() {
		System.out.println("human eat");
	}

	@Override
	public void sleep() {
		System.out.println("Human sleep");
		
	}
	
}
public class Interfacepgm1 {

	public static void main(String[] args) {
		Human ob=new Human();
		ob.bite();
		ob.eat();
		ob.jump();
		ob.sleep();

	}

}
