//(((((10*2)-2)+2)-2)/2)

package Assing1;

public class Assignment2 {
	
	public int mult(int a, int b)
	{
	int c;
	c=a*b;
	return c;
	
	}

	public int sub(int c, int d)
	{
		int e;
		e=c-d;
		return e;
		
	}
	public int sum(int f, int g)
	{
		int h;
		h=f+g;
		return h;
	}
	public int div(int j, int k)
	{
		int l;
		l=j/k;
		return l;
	}
	public static void main(String[] args)
	{
		Assignment2 A = new Assignment2();
		int multresult = A.mult(10, 2);
		System.out.println("Result of Multiplication is " +multresult );
		
		int subresult = A.sub(multresult, 2);
		System.out.println("Result of Sub is "+subresult);
		
		int sumresult =A.sum(subresult, 2);
		System.out.println("Result of sum is "+sumresult);
		
		int subresult2= A.sub(sumresult, 2);
		System.out.println("Result of new sub is "+subresult2);
		
		int finalr = A.div(subresult2, 2);
		System.out.println("Final Answer is "+finalr);
	}
	
}



