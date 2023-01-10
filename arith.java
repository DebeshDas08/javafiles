import java.util.*;
import java.io.*;
class arith
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU \n 1.Addition\n2.Subtract\n3.Multiply\n4.Divide");
		System.out.print("Enter your choice :- ");
		int n=sc.nextInt();
		int a,b;
		switch(n)
		{
			case 1:
				System.out.println("Enter first number");
				
				a=sc.nextInt();
				System.out.println("Enter second Number");
				b=sc.nextInt();
				System.out.println("Sum of two number is "+(a+b));
				break;
			case 2:
				System.out.println("Enter first number");
				
				a=sc.nextInt();
				System.out.println("Enter second Number");
				b=sc.nextInt();
				System.out.println("Subtraction of two number is "+(a-b));
				break;
			case 3:
				System.out.println("Enter first number");
				
				a=sc.nextInt();
				System.out.println("Enter second Number");
				b=sc.nextInt();
				System.out.println("Multiplication of two number is "+(a*b));
				break;
			case 4:
				System.out.println("Enter first number");
				
				a=sc.nextInt();
				System.out.println("Enter second Number");
				b=sc.nextInt();
				System.out.println("Division of two number is "+(a/b));
				break;
			default:
				System.out.println("Invalid Choice");
		}
	}
}
				