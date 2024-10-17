package pkg;
abstract class Shape{
abstract double calculateArea();
abstract double calculateperimeter();}
class Circle extends Shape{
private double radius;
public Circle(double radius){
this.radius=radius;}

double calculateArea(){
return 2*Math.PI*radius*radius;}
double calculateperimeter(){
return 2*Math.PI*radius;}}
class Triangle extends Shape{
private double side1,side2,side3;
public Triangle(double side1,double side2,double side3){
this.side1=side1;
this.side2=side2;
this.side3=side3;}

double calculateArea(){
double s=(side1+side2+side3)/2;
return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));}

double calculateperimeter(){
return side1+side2+side3;
}
}
public class TestAbstractShape{
public static void main(String[] args){
Circle circle=new Circle(5);
System.out.println("Area and circumference of circle are");
System.out.println(circle.calculateArea());
System.out.println(circle.calculateperimeter());
Triangle triangle=new Triangle(3,4,5);
System.out.println("Area and perimeter of triangle are");
System.out.println(triangle.calculateArea());
System.out.println(triangle.calculateperimeter());
}
}