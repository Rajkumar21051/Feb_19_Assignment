package array_Assignment;
import java.util.Scanner;
public class Read_5 
{

	public static void main(String[] args) 
	{
		
//		variable Declaration
		int [] nums=new int[5];
		int i;
		
//		Reading Numbers from the user
		 
		for(i=0;i<nums.length;i++) 
		{
			Scanner n =new Scanner(System.in);
			System.out.println("Enter Number-"+(i+1)+" : " );
			nums[i]=n.nextInt();
		}
		
// 		Printing the Numbers Using for-Loop
		System.out.println("\nUsing For-loop");
		for(i=0;i<nums.length;i++) 
		{
			System.out.println("Number-"+(i+1)+" : "+nums[i]);
		}
		
//		Printing the Numbers Using foreach-Loop
		System.out.println("\nUsing Foreach-loop");
		for(int n:nums) 
		{
			System.out.println("Number : "+n);
		}
	}

}
