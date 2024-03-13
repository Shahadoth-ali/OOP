
package polymorphism;

public class Rectangle extends Shape{
    //area
    double length,width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    
    @Override
    double area(){
        System.out.println("rectangle area");
        return length*width;
    }
}
