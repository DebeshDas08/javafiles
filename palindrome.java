import java.util.*;
import java.io.*;
class palindrome
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println( "Enter a String ");
	String k=sc.nextLine();
	int l = k.length();
	System.out.println( "Length of string is  "+l);
	String k2="";
	for(int i=0;i<l;i++)
	{
		k2=k.charAt(i)+k2;
	}
	System.out.println(k2);
	if(k2.equals(k))
		System.out.println("String is Palindrome ");
	else
		System.out.println("String is not Palindrome");
	}
}
		