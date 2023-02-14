package oops;

import java.util.Scanner;

class Animals
{
	String Category;
	Scanner sc=new Scanner(System.in);
	public void category()
	{
		System.out.println("Enter the category");
		Category=sc.next();
	}
}
class Pets extends Animals
{
	String breedtype;
	Scanner sc=new Scanner(System.in);
	public void petbreed()
	{
		System.out.println("Enter the breed types of Animal");
		breedtype=sc.next();
	}
	public void display()
	{
		System.out.println("******Pet details*****");
		System.out.println("Animal: "+Category);
		System.out.println("breed_type: "+breedtype);
	}
	
}
public class petsapplication_oops {

	public static void main(String[] args) {
		Pets ob=new Pets();
		ob.category();
		ob.petbreed();
		ob.display();
		

	}

}
