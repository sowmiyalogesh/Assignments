package week1.day2;

import java.util.Arrays;

public class FindMissingElements{
    public static void main(String[] args) {
    	int a[]= {1,2,3,4,6,7,8};
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++) 
		{
			sum1=sum1+a[i];
		}
	
		for(int i=a[0];i<=a[a.length-1];i++) 
		{
			sum2=sum2+i;
		}
		
		System.out.println("Missing values is --> "+(sum2-sum1));
}
}
    
		

