package com.justudin;

public class test4 {
	public static void main(String[] args){
		int[] aArr = {1,2,3,4,5};
		int[] rArr = reduce(aArr);
		
		for(int b=1;b<rArr.length;b++)
		{
			System.out.print(rArr[b]+" ");
		}	
	}
	
	public static int[] reduce(int[] a)
	{
		int[] rArr = new int[5];
		for(int b=1;b<a.length;b++)
		{
			rArr[b]=a[b]+a[b-1];
		}
		return rArr;
	}
}
