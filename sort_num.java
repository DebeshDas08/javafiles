import java.util.*;
import java.io.*;
class sort_num
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n;
		int i,j;
		System.out.println("Enter no of elements ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" Elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		int t;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
		}
		System.out.print("Sorted Array is = ");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
		