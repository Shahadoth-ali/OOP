
package polymorphism;


public class Triangle extends Shape{
    double base,height;
    
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    
    @Override
    double area(){
        System.out.println("triangle area");
        return 0.5*base*height;
    }
}
