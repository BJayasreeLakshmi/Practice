package com.kn.incrementingloop;

import java.util.Scanner;

public class IncrementingForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//instructing the user to enter a number
		System.out.println("Enter a range");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
		scan.close();
	}

}
