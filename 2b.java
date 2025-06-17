// 2.b) Write a Java program to illustrate the concept of class with method overloading and method overriding
Method Overloading Program 
import java.util.Scanner;

class Shape {
	double calculateArea(double r)
	{
		return Math.PI*r*r;
	}
   double calculateArea(double l,double w)
	{
		return l*w;
	}
   double calculateArea(int s)
	{
		return s*s;
	}
}
public class MethodOverloadingExample {
    public static void main(String[] args) {
        
        Shape shape = new Shape();
        Scanner scanner = new Scanner(System.in);
        System.out.print("radius of the circle: ");
        double radius = scanner.nextDouble();
        double circleArea = shape.calculateArea(radius);
        System.out.printf("Area of the circle: %.2f\n", circleArea); 
        System.out.print("length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("width of the rectangle: ");
        double width = scanner.nextDouble();
        double rectangleArea = shape.calculateArea(length, width);
        System.out.printf("Area of the rectangle: %.2f\n", rectangleArea); 
        System.out.print("side length of the square: ");
        int side = scanner.nextInt();
        double squareArea = shape.calculateArea(side);
        System.out.printf("Area of the square: %.2f\n", squareArea); 
        scanner.close();
    }
}
