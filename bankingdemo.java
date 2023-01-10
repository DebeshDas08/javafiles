import java.util.*;
import java.io.*;
class bankingdemo
{
	
	int balance;
	public void deposit(int bal){
		balance+=bal;
	}
	public void withdraw(int bal){
		balance-=bal;
	}
	public static void main(String args[]){
		bankingdemo b=new bankingdemo();
		Scanner sc=new Scanner (System.in);
		b.balance=100;
		int a=0;
		
		int bal;
		do{
			System.out.println("Name : Rashmika Mandana");
			System.out.println("Balance : " +b.balance);
			System.out.println("1. Withdraw\n2. Deposit");
			int ch=sc.nextInt();
			switch (ch){
				case 1:
				System.out.println("Enter amount to be withdraw");
				bal=sc.nextInt();
				if(bal>b.balance){
					System.out.println("Insufficient Balance");
				}else{
				b.withdraw(bal);}
				break;
				case 2:
				System.out.println("Enter amount to be deposit");
				bal=sc.nextInt();
				b.deposit(bal);
				break;
				default:
				System.out.println("Invalid Option");
			}
			System.out.println("To continue press 1 else press 0");
			a=sc.nextInt();
		}while(a==1);
	}
}