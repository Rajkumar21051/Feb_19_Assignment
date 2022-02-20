package array_Assignment;
import java.util.Scanner;
public class Sum_Average 
{

		public static void main(String[] args) 
		{
			
//			variable Declaration
			int [] nums=new int[5];
			int i;
			int sum=0;
			
//			Reading Numbers from the user
			 
			for(i=0;i<nums.length;i++) 
			{
				Scanner n =new Scanner(System.in);
				System.out.println("Enter Number-"+(i+1)+" : " );
				nums[i]=n.nextInt();
				sum=sum+nums[i];
			}
//			Sum & Average of the Given Numbers 
			
			System.out.println("The Sum of the Given Numbers is : "+sum);
			System.out.println("The Average of the Given Numbers is : "+sum/nums.length);
		}

}
