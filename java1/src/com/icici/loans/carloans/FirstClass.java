package com.icici.loans.carloans;

import java.util.Scanner;

public class FirstClass
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System .in);
	int a = sc.nextInt();
	System.out.println("value of a ="+a);
	int b = sc.nextInt();
	System.out.println("value of b="+b);
		
	if (a<b)
	{
		for (int i=1;i<=5;i++)
			
		System.out.println("value of i="+i);
		System.out.println("hello world ");
	}
	else {
		System.out.println("b<=a");
	}
	}

}
