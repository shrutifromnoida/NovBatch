package Package2;

public class Student2 {

int RollNo;
int Age;


public void Display1()
{
	System.out.println("Welcome All of you");

	
}

public void Display2()
{

	System.out.println("Automation is very easy");	
}

public static void main(String[] args) {
	
	Student2 Neha =new Student2();
	
	Neha.Display1();
	Neha.Display2();
	Neha.Age=25;
	Neha.RollNo=1;
	
	System.out.println("Age of Anay is " +Neha.Age);
	System.out.println("Roll No of Anay is "+Neha.RollNo);
}
}
