import java.util.*;
import java.io.*;
class student
{
	int id;
	String name;
	void get(int i,String n){
		id=i;
		name=n;
	}
	void show(){
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
	}
}
class aiit extends student
{
	int fee;
	String course_name;
	void get_aiit(int f,String c){
		fee=f;
		course_name=c;
	}
	void display(){
		System.out.println("Course Name : "+course_name);
		System.out.println("Fees : "+fee);
	}
}
public class details
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student name : ");
		String na=sc.nextLine();
		System.out.print("Enter Student ID : ");
		int i=Integer.parseInt(sc.nextLine());
		System.out.print("Enter Course Name : ");
		String cn=sc.nextLine();
		System.out.print("Enter Course Fee : ");
		int fe=Integer.parseInt(sc.nextLine());
		aiit a=new aiit();
		a.get(i,na);
		a.show();
		a.get_aiit(fe,cn);
		a.display();
	}
}