import java.io.*;
import java.util.*;
class arithmatic
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number ");
		System.out.print("Input 1 :");
		num1 = sc.nextInt();
		System.out.print("Input 2 :");
		num2 = sc.nextInt();
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
		System.out.println(num1+" / "+num2+" = "+(num1*1.0/num2));
		System.out.println(num1+" % "+num2+" = "+(num1%num2));

		
		
	}
}
