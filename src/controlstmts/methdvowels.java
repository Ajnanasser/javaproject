package controlstmts;

import java.util.Scanner;

public class methdvowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str=sc.next();
		methdvowels ob=new methdvowels();
		
		
		ob.vowel(str);
		

	}
	public void vowel(String str)
	{
		
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U' || str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' )
			{
				count++;
			}
		}
		System.out.println("The count of vowels in given sentences is " +count);
		
	}

}
