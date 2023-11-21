package Package1;

public class Student { // classname is Student
	
	//{} boundry of the class
	
	int a;
	
	public void Shruti()
	{
		// {} boundry of method
		// () indicate method
		
		System.out.println("My first Java program is to print");
	}

	public static void main(String[] args) 
	{
	
		Student Paras = new Student(); //clssname reference = new classname 
		
		Paras.Shruti();  // calling the method Shruti using reference variable Paras.
		
		Paras.a=100;//calling the variable
		
		System.out.println("Value of a is "+ Paras.a);
		
		
		
	}
}

