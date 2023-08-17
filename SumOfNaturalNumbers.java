package com.kn.sumofnatutalnumbers;

import java.util.Scanner;

//Calculating the sum of natural numbers
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		//instructing the user to enter range
		System.out.println("Enter the range");
		int num=scan.nextInt();
		//initializing a sum variable to store the sum
		int sum=0;
		//loop to iterate to the range
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of "+num+" natural numbers ="+sum);
		scan.close();
	}

}
