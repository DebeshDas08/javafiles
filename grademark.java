import java.io.*;
import java.util.*;
class grademark
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of two subject ");
		System.out.print("Subject 1 :");
		num1 = sc.nextInt();
		System.out.print("Subject 2 :");
		num2 = sc.nextInt();
		double percent=(num1+num2)/2.0;
		System.out.println("Percentage = "+percent);
		if(percent>=90)
		System.out.println("Grade is O ");
		else if(percent>=80)
		System.out.println("Grade is A ");
		else if(percent>=70)
		System.out.println("Grade is B ");
		else if(percent>=60)
		System.out.println("Grade is C ");
		else if(percent>=50)
		System.out.println("Grade is D ");	
		else if(percent>=40)
		System.out.println("Grade is E ");
		else
		System.out.println("Congratulation you have FAILED ");
	}
}