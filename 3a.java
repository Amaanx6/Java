3.a) Write a Java program to demonstrate the Interfaces & Abstract Classes.
package q18023;
// import required classes
// Define interface Calculator { }
import java.util.*;
interface Calculator
	{
	double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
	}
class BasicCalculator implements Calculator {
    // Define required methods
	public double add(double a,double b)
	{
		return a+b;
	}
	public double subtract(double a, double b)
	{
		return a-b;
	}
   public double multiply(double a, double b)
	{
		return a*b;
	}
   public double divide(double a, double b){
		return a/b;
	}
}
public class Calc {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double result1 = calculator.add(a, b);
        double result2 = calculator.subtract(a, b);
        double result3 = calculator.multiply(a, b);
        double result4 = calculator.divide(a, b);

        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + result4);
   
        
    }
}

