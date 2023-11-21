//  (((((10+2)+2)-2)*2)/2)
package Assing1;

public class Assignment1 {

	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}
	
	public int mul(int p, int q)
	{
		int r;
		r=p*q;
		return r;
	}
	
	public int Div(int c, int d)
	{
		int e;
		e=c/d;
		return e;
		
	}
	
	public static void main(String[] args) {
		
		Assignment1 Ob =new Assignment1();
		int sumresult = Ob.sum(10, 2);		
		int sumresult2 = Ob.sum(sumresult,2);
		System.out.println("Result of Sum is "+sumresult2);
		
		int subresult = Ob.sub(sumresult2, 2);
		System.out.println("Result of Sub is " +subresult);		
		
		int multresult = Ob.mul(subresult, 2);
		System.out.println("Result of Mult is "+multresult);
		
		int divresult = Ob.Div(multresult, 2);
		System.out.println("Final result is "+divresult);
	}	
	
}



