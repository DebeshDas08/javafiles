import java.util.*;
import java.io.*;
class areaobject
{
	final double pi=3.14;
	public double circle(double pi,int r)
	{
		return (pi*r*r);
	}
	public int rectangle(int a,int b)
	{
		return (a*b);
	}
	public double triangle(int h,int b)
	{
		return (h*(double)b/2.0);
	}
	public double square(int a)
	{
		return (a*a);
	}
	public static void main(String args[])
	{
		int op;
		areaobject ao=new areaobject();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Area of Circle\n2.Area of Rectangle\n3. Area of triangle\n4. Area of Square");
		System.out.println("Choose an option");
		op=sc.nextInt();
		switch (op)
		{
			case 1:
			System.out.println("Enter the radius of circle ");
			int r=sc.nextInt();
			System.out.println("Area of circle is = "+ao.circle(ao.pi,r));
			break;
			case 2:
			System.out.println("Enter the length and breath of the rectangle ");
			int l=sc.nextInt();
			int h=sc.nextInt();
			System.out.println("Area of rectangle is = "+ao.rectangle(l,h));
			break;
			case 3:
			System.out.println("Enter the base and height of the triangle");
			l=sc.nextInt();
			h=sc.nextInt();
			System.out.println("Area of rectangle is = "+ao.triangle(l,h));
			break;
			case 4:
			System.out.println("Enter the side of sqaure");
			l=sc.nextInt();
			System.out.println("Area of sqaure is = "+ao.square(l));
			break;
			default:
			System.out.println("Enter a valid option");
		}
	}
}
			