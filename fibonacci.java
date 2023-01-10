import java.util.*;
import java.io.*;
class fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int k=sc.nextInt();
		int n1=0,n2=1;
		int n3=0;
		System.out.println("Fibonacci series of "+k+" number is :");
		System.out.print(n1 +" , "+n2);
		for(int i=2;i<k;i++)
		{
			n3=n2+n1;
			System.out.print(" , "+n3);
			n1=n2;
			n2=n3;
		}
	}
}