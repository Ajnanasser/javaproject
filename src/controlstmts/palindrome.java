package controlstmts;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	int rev=0,num=0,x,temp;
	temp=num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	while(num>0)
	{
		x=num%10;
		rev=rev*10+x;
		num=num/10;
	}
	if(temp==rev)
	{
		System.out.println("number is palindrome");
	}
	else
	{
		System.out.println("number is not palindrome");
	}
	}

}
