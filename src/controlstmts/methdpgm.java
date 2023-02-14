package controlstmts;

public class methdpgm {

	public static void main(String[] args) {
		methdpgm ob=new methdpgm();
		ob.add();
		ob.sub(10, 5);
		int mul_value=ob.mul();
		System.out.println(mul_value);
		double div_value=ob.div(10, 5);
		System.out.println(div_value);
		

	}
	//1.method without parameter and without return type
	public void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
	}
	//2.method with parameter and without return type
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	//3.method without parameter and with return type
	public int mul()
	{
		int a=10,b=10,c;
		c=a*b;
		return c;
	}
	//4.method with parameter and with return type
	public double div(double a,double b)
	{
		double d=a/b;
		return d;
	}

}
