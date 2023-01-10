import java.util.*;
import java.io.*;
abstract class shape{
   abstract void area(); //abstract method
  public void display(){ //non-abstract method
	   System.out.println("This is a Program to find out Area");
   }
}
class triangle extends shape{
    
    void area(){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter height and base of triangle: ");
		int h=sc.nextInt();
		int b=sc.nextInt();
        System.out.println("Area of Triangle is = "+(0.5*h*b)+"\n");}
}
class rectangle extends shape{
    
    void area(){
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle: ");
		int l=sc.nextInt();
		int b=sc.nextInt();
        System.out.println("Area of rectangle is = "+(l*b)+"\n");}
}
class circle extends shape{
   
    void area(){
         Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		int r=sc.nextInt();
        System.out.println("Area of circle is = "+(3.14*r*r)+"\n");}
}
class ar{
    public static void main(String[] args){
        shape c=new circle();
        shape r=new rectangle();
        shape t=new triangle();
		t.display();
        c.area();
        r.area();
        t.area();
    }
}