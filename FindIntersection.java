package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1= {3,2,11,4,6,7};
		int[] num2={1,2,8,4,9,7};
		for(int i=0;i<num1.length-1;i++) {
			for(int j=0;j<num2.length-1;j++) {
				if(num1[i]==num2[j]) {
					
					System.out.println(num1[i]);
				}
			}
			
		}

	}

}
