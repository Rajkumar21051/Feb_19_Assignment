package array_Assignment;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) 
	{
		
//		variable Declaration
		int [] nums=new int[5];
		int n = nums.length;
		int i,j;
		int temp;
//		Reading Numbers from the user
		 
		for(i=0;i<n;i++) 
		{
			Scanner m =new Scanner(System.in);
			System.out.println("Enter Number-"+(i+1)+" : " );
			nums[i]=m.nextInt();
		}
		
//		 Sorting the numbers using bubble sort
		for(i=0;i<n;i++) 
		{
			for(j=0;j<n-i-1;j++) 
			{
				if (nums[j]>nums[j+1]) 
				{
					temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
					
				
			}
		}
		System.out.println("Sorting Numbers using Bubble Sort");
		for(int d:nums) {
			System.out.println(d);
		}
	}

}
