package oops;

class Animal
{
	public void display()
	{
		System.out.println("Animal details");
	}
}
class Cat extends Animal
{
	public void catdetails()
	{
		System.out.println("Cat");
	}
}
class Dog extends Animal
{
	public void dogdetail()
	{
		System.out.println("Dog details");
	}
}
public class Heirarchialinherit {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.catdetails();
		c.display();
		Dog d=new Dog();
		d.dogdetail();
		d.display();

	}

}
