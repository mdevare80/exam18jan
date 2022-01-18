package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Take input from the user
    //Create an instance of the Scanner Class
    Scanner sc=new Scanner(System.in);
    //Declare and Initialize the variable
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    int i=1,fact=1;
    while(i<=num)
    {
        fact=fact * i;
        i++;
    }
    System.out.println("Factorial of the number: "+fact);
    }
}
