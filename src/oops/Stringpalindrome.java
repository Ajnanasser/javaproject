package oops;

import java.util.Scanner;

class Palindrome
{
	public void print()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String h=sc.next();
		String reversestr="";
	  
		for(int i=h.length()-1;i>=0;i--)
		{
			reversestr=reversestr+h.charAt(i);
		}
		System.out.println(""+"reverse="+reversestr);
		if(h.toLowerCase().equals(reversestr.toLowerCase()))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
}
	
}
public class Stringpalindrome {

	public static void main(String[] args) {
		
		Palindrome ob=new Palindrome();
		ob.print();

	}
}


