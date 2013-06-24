package com.justudin;
import java.util.*;
public class test5 {
	private static Scanner scanner;

	public static void main(String[] args){
		int a=readInt();
		int result= count(a);
		System.out.println("The Result is : "+result);
	}
	
	static int readInt()
	{
		scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		return scanner.nextInt();
	}
	
	static int count(int n){
		int sum=0;
		while (n > 0) {
            int p = n % 10;
            sum = sum + p;
            n = n / 10;
		}
		return sum;
	}
}

