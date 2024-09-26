package oopjs;
class Shape{
    public void draw(){
        System.out.println("Drawing a shape");}
    public void erase(){
            System.out.println("Erasing a shape");}}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing acircle");}
    public void erase(){
        System.out.println("Erasing acircle");}}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a triangle");}
    public void erase(){
        System.out.println("Erasing a triangle");}}
class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Square");}
    public void erase(){
        System.out.println("Erasing a Square");}}
public class TestShape{
    public static void main(String[] args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for(int i=0;i<shapes.length;i++){
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("-------------");}
    }
    
    
    
            
    
}