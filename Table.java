package com.kn.table;

import java.util.Scanner;

//Printing a table using for loop
public class Table {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Instructing the user to a number 
		System.out.println("Enter a number");
		int number=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+" * "+i+" = "+(number*i));
		}
		scan.close();
	}

}
