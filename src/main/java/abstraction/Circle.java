
package abstraction;

public class Circle extends Shape{
    //dim1,dim2
   Circle(double r){
       super(r,r);
   }
    @Override
    void area(){
        double result=3.1416*dim1*dim2;
        System.out.println("rect circle : "+result);
    }
}
