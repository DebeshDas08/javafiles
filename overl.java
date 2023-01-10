import java.util.*;
import java.io.*;
class dem
{
	int a;
	dem(){
		a=10;
		System.out.println("This is default constructor\n Value of A="+a);
	}
	dem(int a)
	{
		this.a=a;
		System.out.println("This is parameterized constructor\nValue of A ="+this.a);
	}
}
public class overl
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A");
		int a=Integer.parseInt(sc.nextLine());
		dem d=new dem();
		dem k=new dem(a);
	}
}