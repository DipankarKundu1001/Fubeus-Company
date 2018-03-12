package org.company.Fubeus;

import java.util.Scanner;

public class PrimeNumberWithoutMod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int num = sc.nextInt();
		int c=0;
		sc.close();
		for(int i=2;i<num;i++)
		{
		  if((num-(num/i)*i)==0) // without using %
		   c++;
		}
		if(c==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}

}
