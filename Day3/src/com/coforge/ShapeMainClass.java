package com.coforge;
import java.util.Scanner;
public class ShapeMainClass {
 
	public static void main(String[] args) {
		String type;
		Shape sh;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the type Circle/Square");
		type=sc.next();
		if(type.equals("Circle")) {
			System.out.println("enter radius");
			double r =sc.nextDouble();
			sh=new Circle(r);
			sh.area();
			sh.circumference();
		}
		else if(type.equals("Square")) {
			System.out.println("enter side");
			double s =sc.nextDouble();
			sh=new Square(s);
			sh.area();
			sh.circumference();
		}
		else {
			System.out.println("invalid shape");
		}
		
//       Circle c = new Circle(7);
//       c.area();
//       c.circumference();
//       Square s = new Square(5);
//       s.area();
//       s.circumference();
		
       
 
}
}
 