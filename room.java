import java.io.*;
import java.util.*;
class room
{
	int roomno;
	String roomtype,acmachine;
	double roomarea;
	
	room()
	{
		roomno=0;
		roomtype="";
		acmachine="";
		roomarea=0.0;
	}
	public void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details of the room :-");
		System.out.print("Room No: - ");
		roomno=sc.nextInt();
		System.out.print("Room type: - ");
		roomtype=sc.next();
		System.out.print("Do room have AC (Yes/No) : - ");
		acmachine=sc.next();
		System.out.print("Room Area in sq.metre - ");
		roomarea=sc.nextDouble();
	}
	public void displaydata()
	{
		System.out.println("Room Number= "+roomno);
		System.out.println("Room Type= "+roomtype);
		System.out.println("Availability of AC = "+acmachine);
		System.out.println("Room Area= "+roomarea+" square metre");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		room r=new room();
		int i=0;
		do{
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * ");
		System.out.println("1.Set Data\n2.Display Data");
		System.out.println("Enter the option");
		
		int ch=sc.nextInt();
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * ");
		switch(ch)
		{
			case 1:
			r.setdata();
			break;
			case 2:
			r.displaydata();
			break;
			default:
			System.out.println("Enter the correct option");
			break;
		}
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * ");
		System.out.println("Do you want to exit\n1.Yes\n2.No");
		i=sc.nextInt();
		
	}while(i==2);
}
}