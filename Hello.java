/*class Hello{
	public static  void main(String args[ ] )
	{
		System.out.println("Hello");
	}
}*/
import java.io.*;
class Student
{
	int roll_no;
	String name;
	float per;
}
 class Hello
 {
	 public static void main(String args[])
	 {
		 Student s1 = new Student();
		 /*s1.roll_no = 10;
		 s1.name = "ashwini";
		 s1.per = 70;*/
		 System.out.println("RNO:"+ s1.roll_no);
		 System.out.println("NAME:"+ s1.name);
		 System.out.println("PER:"+ s1.per);
	}
 }