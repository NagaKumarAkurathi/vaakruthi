package com.vaakruthi.arrays;

public class TwoPattern {
public static void main(String[] args) {
	int a [][] = {{2,4,6},{8,2,4},{6,8,2}};
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
