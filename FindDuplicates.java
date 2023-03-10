package week1.day2;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {2, 5, 7, 7, 5, 9, 2, 3};
		
		//for(int i = 0; i < nums.length; i++)
		//{
			
			//for(int j=i+1;j<nums.length;j++ )//(int j=0; j<i;j++)
			//	{
			//	if(nums[i]==nums[j])
				//{
				//	System.out.println(nums[j]);
				//}
			//}
		//}
		
		//Method2
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				System.out.println(nums[i]);
				
			}
		}
	}
}
