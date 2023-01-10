import java.util.*;
import java.io.*;
class data
{
	int id,salary;
	String name,dept;
	data(int i,String n,int s,String d)
	{
		id=i;
		salary=s;
		name=n;
		dept=d;
	}
	void display()
	{
		System.out.println("Employee ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
		System.out.println("Department = "+dept);
	}
}
class employee{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Details : ");
		System.out.print("ID = ");
		int i=Integer.parseInt(sc.nextLine());
		System.out.print("Name = ");
		String n=sc.nextLine();
		System.out.print("Salary = ");
		int s=Integer.parseInt(sc.nextLine());
		System.out.print("Department = ");
		String d=sc.nextLine();
		data e=new data(i,n,s,d);
		System.out.println("---------xxxxxxx-----------");
		e.display();
	}
}
	