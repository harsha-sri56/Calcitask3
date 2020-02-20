package task3;
import java.util.*;

public class Calci {
	private static Scanner scan;

	public static void main(String[] args) 
	 {
		 int a, b, res;
		 char ch;
		 scan = new Scanner(System.in);
		 
		 System.out.print("Enter First Number : ");
		 a=scan.nextInt();
		 System.out.print("Enter Second Number : ");
		 b=scan.nextInt();
		 System.out.print("Enter Operator (+,-,*,/) : ");
		 ch=scan.next().charAt(0);
		 
		 if(ch == '+')
		 {
			 res = a + b;
			 System.out.print("Result = " +res);
		 }
		 else if(ch == '+')
		 {
			 res = a - b;
			 System.out.print("Result = " +res); 
		 }
		 else if(ch == '*')
		 {
			 res = a * b;
			 System.out.print("Result = " +res);
		 }
		 else if(ch == '/')
		 {
			 res = a / b;
			 System.out.println("Result = " +res);
		 }
		 else 
		 {
			 System.out.println("Wrong Operator !!!");
		 }
	 }
	
}
