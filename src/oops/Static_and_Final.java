package oops;

public class Static_and_Final {
	static String companyname="Luminar Technolab";
	final int n=2345;

	public static void main(String[] args) {
		System.out.println(companyname="Luminar");//we can give value here too.memory doesn't change only overwrite
		Static_and_Final s=new Static_and_Final();
		System.out.println(s.n);
	}

}
