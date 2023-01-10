import java.io.*;
import java.util.*;
class evenout
{
	public static void main(String args[])
	{
		int a,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		a = sc.nextInt();
		r=a%2;
		if(r==1)
		{
			System.out.println("Number is ODD");
		}
		else
		{
			System.out.println("Number is EVEN");
		}
	}
}