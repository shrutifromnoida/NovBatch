package MethodsDiff;

public class Arithmatic {

	public int sum(int a,int b) 
	{
		int c;
		c=a+b;
		System.out.println("Sum result is " +c);
		return c;
		
	}

	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("Sub result is " +z);
		return z;
	}
	
	public void mult(int x1,int x2)
	{
		int x3;
		x3=x1*x2;
		
		System.out.println("The final result is "+x3);
	}
	
	public static void main(String[] args) {
		
		Arithmatic dc= new Arithmatic();
		int sumresult= dc.sum(12,2);
		int subresult= dc.sub(12, 2);
		dc.mult(sumresult, subresult);
	}
}

