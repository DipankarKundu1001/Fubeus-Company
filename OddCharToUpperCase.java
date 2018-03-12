package org.company.Fubeus;

import java.util.Scanner;

public class OddCharToUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String str = sc.nextLine();
		sc.close();
		String str1="";
		for(int i = 0; i < str.length(); i++)
		{
			if(i%2 != 0)
				str1 = str1 + Character.toUpperCase(str.charAt(i));
			else
				str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);
	}
}
