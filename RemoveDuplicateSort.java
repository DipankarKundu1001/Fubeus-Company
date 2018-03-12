package org.company.Fubeus;

import java.util.Scanner;

public class RemoveDuplicateSort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array :- ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the " + (i+1) + " element :- ");
			arr[i] = sc.nextInt();
		}
		
		removeDuplicate(arr,n);
	}
	
	private static void removeDuplicate(int[] arr, int n)
	{
		int[] arr1 = new int[n];
		int count=0;
		for(int i = 0; i < n; i++)
		{
			if(i==0)
				arr1[count++] = arr[0];
			else
			{
				if(comp(arr[i], arr1, count))
					arr1[count++] = arr[i];
			}
		}
		sort(arr1,count);
	}
	
	//Bubble sort
	private static void  sort(int[] arr1, int count)
	{
		int temp;
		for(int i = 0; i < count-1; i++)
		{
			for(int j = 0; j < count-i-1; j++)
			{
				if(arr1[j] > arr1[j+1])
				{
					temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		
		print(arr1,count);
	}
	
	private static void print(int[] arr1, int count)
	{
		for(int i = 0; i < count; i++)
			System.out.print(arr1[i] + "  ");
	}
	private static boolean comp(int temp, int[] arr1, int count)
	{
		for(int i = 0; i < count; i++)
		{
			if(temp == arr1[i])
				return false;
		}
		return true;
	}
}
