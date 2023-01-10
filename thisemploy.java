import java.util.*;
import java.io.*;
class this_test
{
	int val1,val2;
	this_test()
	{
		System.out.println("Default Constructor");
	}
	this_test(int val1,int val2)
	{
		this();
		this.val1=val1*val1*val1;
		this.val2=val2*val2*val2;
		System.out.println(val1);
		System.out.println(val2);
	}
	void display()
	{
		System.out.println("Cube is "+val1+" "+ val2);
	}
}
class thisemploy
{
	public static void main(String args[])
	{
		this_test t=new this_test(5,12);
		t.display();
	}
}
	