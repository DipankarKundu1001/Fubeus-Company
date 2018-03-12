package org.company.Fubeus;

import java.util.Scanner;

public class Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				if((i+j)%2 == 0)
					System.out.print("*");
				else
					System.out.print("-");
			}
			System.out.println();
		}
	}
}

/*
	*-*-*-
	-*-*-*
	*-*-*-
*/
