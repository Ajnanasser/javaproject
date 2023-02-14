package controlstmts;

import java.util.Scanner;

public class methdprime {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
			int num;
			System.out.println("enter the number");
			num=sc.nextInt();
		  
		methdprime ob=new methdprime();
		
		ob.prime(num);

	}
  public void prime(int num) 
  {
	boolean flag=true;
	if(num==0||num==1)
	{
		System.out.println("prime");
	}
	else
	{
		 for(int i=2;i<num;i++)
		  {
			  if(num%i==0)
			  {
				  flag=false;
				  break;
			  }
		  }
		  if(flag)
		  {
			  System.out.println("prime");
			  
		  }
		  else
		  {
			  System.out.println("not prime");
		  }
	}
	 
  }
}
