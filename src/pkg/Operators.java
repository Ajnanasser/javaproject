package pkg;

public class Operators {

	public static void main(String[] args) {
	int a=20,b=30;
	//arithmetic operator
	System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a*b="+(a*b));
	System.out.println("a/b="+(a/b));
	System.out.println("a%b="+(a%b));
	//assignment operator
	System.out.println(a+=b);
	//relational
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a==b);
	//logical
	String username="ajna";
	String password="ajna123";
	System.out.println(username=="ajna" && password=="ajna123");
	System.out.println(username=="ajn" || password=="ajna123");
	System.out.println(!(username=="ajna"));
	
	//unary
	int i=10;
	System.out.println(i++);
	System.out.println(i);
	System.out.println(i--);
	System.out.println(i);
	
	
	}

}
