
package static_block;

public class Box {
    double height,width,depth;
    
    Box(double h,double w,double d){
        height=h;//left e thake instance variable
        width=w;//right e thake local
        depth=d;//this add hoy instance variable e
    }
    
    void displayVol(){
        double result=height*width*depth;
        System.out.println("Box volume is :"+result); 
    }
    
}
