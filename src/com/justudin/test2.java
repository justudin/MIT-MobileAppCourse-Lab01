package com.justudin;

public class test2 {
	public static void main(String[] args){
		int start=1;
		int end=100;
		for(start=1;start<=end;start++)
		{
			if(start%3==0 && start%5==0){
				System.out.println("Div3Div5");
			}else if(start%3==0){
				System.out.println("Div3");
			}else if(start%5==0){
				System.out.println("Div5");
			}else{
				System.out.println(start);
			}
		}
	}
}
