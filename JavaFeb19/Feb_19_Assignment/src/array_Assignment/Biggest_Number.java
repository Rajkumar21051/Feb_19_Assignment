package array_Assignment;

import java.util.Scanner;

public class Biggest_Number {

	public static void main(String[] args) 
	{
		
//		variable Declaration
		int [] nums=new int[5];
		int i;
		
		
//		Reading Numbers from the user and to Find the Biggest number
		 
		for(i=0;i<nums.length;i++) 
		{
			Scanner n =new Scanner(System.in);
			System.out.println("Enter Number : " );
			nums[i]=n.nextInt();
		}
		int Big=nums[0];
		for(i=1;i<nums.length;i++) 
		{
			if(Big>nums[i])
			{
				Big = Big;
			}
			else 
			{
				Big = nums[i];
			}
		}
		System.out.println("The biggest number in the Given Numbers is : "+ Big);
	}
}