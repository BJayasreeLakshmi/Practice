package com.kn.decrementingforloop;

import java.util.Scanner;

public class DecrementingForloop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//instructing the user to enter a number
		System.out.println("Enter a number");
		int num=scan.nextInt();
		for(int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
		scan.close();
	}

}
