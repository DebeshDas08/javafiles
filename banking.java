import java.util.*;
import java.io.*;
class bank
{
	
		
		int accno[]={33401,33402,33405,33406,33407};
		String name[]={"Debesh","Tina","Karan","Suresh","Danish"};
		int amount[]={200,250,100,1000,555};
	int d;
	
	public void deposit(int n)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to be deposit");
		d=sc.nextInt();
		amount[n]+=d;
		System.out.println("Balance after desposit = "+amount[n]);
	}
	public void withdraw(int n)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount to be Withdraw");
		d=sc.nextInt();
		if(d<amount[n]){
			
		amount[n]-=d;
		System.out.println("Balance after withdraw= "+amount[n]);}
		else
			System.out.println("Insufficient Balance");
	}
}
class banking 
{
	public static void main(String args[])
	{
		int o=0;
		bank bk=new bank();
		Scanner sc= new Scanner(System.in);
		do
		{
		int i,ko=0;
		for(i=0;i<5;i++)
			System.out.println(bk.accno[i]+"  "+bk.name[i]+"   Balance= "+bk.amount[i]);
		System.out.print("Enter account number  ");
		int no=sc.nextInt();
		
		for(i=0;i<5;i++)
		{
			if(bk.accno[i]==no)
				ko=i;
		}
		System.out.println("Account number "+bk.accno[ko]+" is selected\nHello "+bk.name[ko]+" Welcome to Internet Banking");
		System.out.println("Balance = "+bk.amount[ko]);
		System.out.println("1.Deposit\n2.Withdraw\nEnter one option");
		int op=sc.nextInt();
		switch (op)
		{
			case 1:
				
				bk.deposit(ko);
				
				break;
			case 2:
				
				bk.withdraw(ko);
				
				break;
			default:
				System.out.println("Enter a valid option");
		}
		System.out.println("Press 1 to continue internet banking or press 0");
		o=sc.nextInt();
		}while(o==1);
	}
}