import java.util.*;
import java.io.*;
 class salary
{
	int sal;
	void salar(int k)
	{
		sal=k;
	}
		
}
 class hra extends salary
{
	public void calculate1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter House Rent Allowance : ");
		int hra= sc.nextInt();
		sal+=hra;
	}
}
 class da extends hra
{

	public void calculate2()
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Dearness Allowance : ");
		int da=sc.nextInt();
		sal+=da;
	}
}
 class bonus extends da
{
	public void calculate3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Bonus : ");
		int b=sc.nextInt();
		sal+=b;
		
	}
}
public class multilevel
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary of the Faculty : ");
		int s=sc.nextInt();
		bonus b=new bonus();
		b.salar(s);
		b.calculate1();
		b.calculate2();
		b.calculate3();
		System.out.println("Gross Salary of Faculty is : "+b.sal);
	}
}
		
