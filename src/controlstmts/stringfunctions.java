package controlstmts;

public class stringfunctions {

	public static void main(String[] args) {
		String s="hello";
		String s1="welcome to programming";
		String s2="Hello";
		String s3="     hai";
		
		//concat
		System.out.println(s.concat(s1));
		System.out.println(1+2+s+3+4);
		
		//equals
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//tolowercase,to uppercase
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//split
		String arr[]=s1.split("programming");
		for(String v:arr)
		{
			System.out.println(v);
		}
		
		//trim
		System.out.println(s3.trim());
		
		//startswith,endswith
		System.out.println(s1.startsWith("welcome"));
		System.out.println(s1.endsWith("programming"));
		
		//charAt
		System.out.println(s.charAt(2));
		
		//contains
		System.out.println(s1.contains("to"));
		//substring
		System.out.println(s3.substring(1, 3));
		
		//length
		System.out.println(s1.length());
		
		//tochararray
		char arr1[]=s.toCharArray();
		for(char v1:arr1)
		{
			System.out.println(v1);
		}
	}



}
