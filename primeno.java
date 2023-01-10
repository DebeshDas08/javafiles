import java.util.*;
import java.io.*;
class primeno
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println( "Enter a number ");
	int k=sc.nextInt();
	int i =2,n,j;
	while(i<=k)
	{
		j=2;
		n=0;
		while(j<=(i/2))
		{
			if(i%j==0)
			{
				n=1;
				
			}
			j++;		
		}
		if(n==0){
		System.out.print(i+", ");}
		i++;
	}
	}
}
			