package week1.day2;

public class Calculator {

	
	public int addition(int a,int b,int c) {
		int sum=a+b+c;
		return sum;
		
	}
	public int multiplication(int x,int y) {
		
		return x*y;
		
	}
	public void subtraction(int a, int b) {
	
	int c= a-b;
	System.out.println("Subtraction value:" + c);
	
	
	}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Calculator samecal=new Calculator();
		System.out.println(samecal.addition(5, 8, 19));
		System.out.println(samecal.multiplication(7, 5));
		samecal.subtraction(6, 3);
		
	}

}
