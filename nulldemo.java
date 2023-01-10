import java.io.*;
import java.util.*;
class nulldemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=null;
		String str2=null;
		System.out.println("Enter Yes or No");
		str=sc.nextLine();
		System.out.println(" * * * * * * * * ");
		try{
			if (str.equals("Yes")&& str2.equals("Yes"))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		catch(NullPointerException e){
			System.out.println("Value is Null    // Exception occurs");
		}
		finally{
			System.out.println("Hello World     //finally statement");
		}
		System.out.println(" * * * * * * * * ");
	}
}