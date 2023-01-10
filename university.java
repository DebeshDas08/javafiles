import java.util.*;
import java.io.*;
class detail{
	String fname,sname;
	int age;
	detail(String f, String s, int a){
		fname=f;
		sname=s;
		age=a;
	}
}
class student extends detail{
	String course,semester;
	int fees;
	student(String f,String s,int a,String ce, String se,int fe){
		super(f,s,a);
		course=ce;
		semester=se;
		fees=fe;
	}
	void display(){
		System.out.println("Name of Student: "+fname+" "+sname);
		System.out.println("Age : "+age);
		System.out.println("Course : "+course+" "+semester+" sem");
		System.out.println("Fees : "+fees);
	}
}
class faculty extends detail{
	String department;
	int salary;
	faculty(String f,String s,int a,String de,int se){
		super(f,s,a);
		department=de;
		salary=se;
	}
	void display(){
		System.out.println("Name of Faculty : "+fname+" "+sname);
		System.out.println("Age : "+age);
		System.out.println("Department : "+department);
		System.out.println("Salary : "+salary);
	}
}
class university{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("1.Faculty Details\n2.Student Details\nEnter your choice :");
		int ch=sc.nextInt();
		
		switch (ch){
			case 2:
			student s= new student("Rashmika","Madana",23,"MCA","1",86000);
			s.display();
			break;
			case 1:
			faculty f=new faculty("Alia","Bhatt",29,"AIIT",45000);
			f.display();
			break;
			default:
			System.out.println("Incorrect Option");
		}
	}
}