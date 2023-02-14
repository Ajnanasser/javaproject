package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

/*Exception is a problem that arises during the execution of a  program.it disturb the normal problem of program.
 * 1.build -in exception:-
 * exception two types:-compile time exception(checked exception):-
 * 1.classnotfoundexception
 * 2.filenotfoundexception
 * 3.IO exception
 * run time exception(unchecked exception):-
 * 1.Arithmetic exception:-double c=a/b
 * 2.Nullpointer exception:-String s=null(no value here)
 * 3.arrayindexfoundofexception:-out of size array.
 * Exception handling:
 * try catch block:-
 * throws:-used in method signature.multiple exception can be added
 * throw:-
 * finally:-if an error is found or  not in catch block.it goes to finally.
 * */
public class Exceptionhandlingpgm {

	public static void main(String[] args) throws FileNotFoundException {
	int a=5,b=0;
	try
	{
		
		double c=a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
System.out.println("hello");
	
try
{
	String s=null;
	System.out.println(s.length());
}
catch(Exception e)
{
	System.out.println("nullpointer exception");
}
finally
{
	System.out.println("hai");
}
FileInputStream f=new FileInputStream("E://book1.xlsx");
	}
	
}
