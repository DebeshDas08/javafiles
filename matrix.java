import java.util.*;
import java.io.*;
class matrix
{
	public static void main(String args[])
	{
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first matrix");
		int a1n1=sc.nextInt();
		int a1n2=sc.nextInt();
		int a1[][]=new int[a1n1][a1n2];
		System.out.println("Enter elements of first matrix");
		for(i=0;i<a1n1;i++)
			for(j=0;j<a1n2;j++)
				a1[i][j]=sc.nextInt();
		System.out.println("Enter size of second  matrix");
		int a2n1=sc.nextInt();
		int a2n2=sc.nextInt();
		int a2[][]=new int[a2n1][a2n2];
		System.out.println("Enter elements of second matrix");
		for(i=0;i<a2n1;i++)
			for(j=0;j<a2n2;j++)
				a2[i][j]=sc.nextInt();
		System.out.println("Matrix 1 =");
		for(i=0;i<a1n1;i++){
			for(j=0;j<a1n2;j++)
				System.out.print(a1[i][j]+" ");
			System.out.println();	
		}
		System.out.println("Matrix 2 = ");
		for(i=0;i<a2n1;i++){
			for(j=0;j<a2n2;j++)
				System.out.print(a2[i][j]+" ");
			System.out.println();	
		}
		if(a1n2==a2n1)
		{
		int r[][]=new int[a1n1][a2n2];
		
		for(i=0;i<a1n1;i++)
		{
			for(j=0;j<a2n2;j++)
			{
				for(k=0;k<a1n2;k++)
				{
					r[i][j]+=a1[i][k]*a2[k][j];
				}
			}
		}
		System.out.println("Result ");
		for(i=0;i<a1n1;i++){
			for(j=0;j<a2n2;j++)
				System.out.print(r[i][j]+" ");
			System.out.println();	
		}
		}
		else{
			System.out.println("Multiplication is not possible");
		}
		
		
	}
}