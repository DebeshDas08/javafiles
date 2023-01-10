import java.util.*;
import java.io.*;
class sort_string
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int i,j;
		String t;
		System.out.println("Enter no of elements");
		int n=sc.nextInt();
		String name[]=new String[n];
		System.out.println("Enter "+n+" names");
		for(i=0;i<name.length;i++)
		{
			name[i]=sc.next();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					t=name[j];
					name[j]=name[i];
					name[i]=t;
				}
			}
		}
		System.out.println("Names in ascending order");
		for(i=0;i<n;i++)
		{
			System.out.println(name[i]);
		}
	}
}
