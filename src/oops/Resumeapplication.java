package oops;

import java.util.Scanner;

interface resume
{
	public void resumedetails();
	public void displayresume();
}
class Resume_person implements resume
{
   String name;
   String mailid;
   String linkedin;
   String phone_no;
   String Address;
   String certification;
   String project;
   String work_experience;
   String education;
   String technical_skill;
   String personal_skill;
   String hobbies;
   Scanner sc=new Scanner(System.in);
	@Override
	public void resumedetails() {
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your mailid");
		mailid=sc.next();
		System.out.println("Enter your linkedin address");
		linkedin=sc.next();
		System.out.println("Enter your phone number");
		phone_no=sc.next();
		System.out.println("Enter your Address");
		Address=sc.next();
		System.out.println("Enter your certification");
		certification=sc.next();
		System.out.println("Enter your project details");
		project=sc.next();
		System.out.println("Enter your work experience");
		work_experience=sc.next();
		System.out.println("Enter your Education details");
		education=sc.next();
		System.out.println("Enter your Technical skills");
		technical_skill=sc.next();
		System.out.println("Enter your personal skills");
		personal_skill=sc.next();
		System.out.println("Enter your Hobbies");
		hobbies=sc.next();
		
		
		
	}

	@Override
	public void displayresume() {
		System.out.println("******RESUME********");
		System.out.println("FULL NAME       :  "+name);
		System.out.println("MAIL ID         :  "+mailid);
		System.out.println("LINKED IN       :  "+linkedin);
		System.out.println("PHONE NO        :  "+phone_no);
		System.out.println("ADDRESS         :  "+Address);
		System.out.println("CERTIFICATION   :  "+certification);
		System.out.println("PROJECTS        :  "+project);
		System.out.println("WORK EXPERIENCE :  "+work_experience);
		System.out.println("EDUCATION       :  "+education);
		System.out.println("TECHNICAL SKILLS:  "+technical_skill);
		System.out.println("PERSONAL SKILLS :  "+personal_skill);
		System.out.println("HOBBIES         :  "+hobbies);
		
		
	}
	
}

public class Resumeapplication {

	public static void main(String[] args) {
		Resume_person ob=new Resume_person();
		ob.resumedetails();
		ob.displayresume();

	}

}
