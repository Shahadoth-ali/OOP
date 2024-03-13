
package super_keyword;

public class Car extends Vehicle{
   //color ,weight,atribute
    int gear;
    Car(String c,double w,int g){
//        color=c;
//        weight=w;
        super(c,w);
        gear=g;
    }
    @Override
     void atribute(){
//        System.out.println("color : "+color);
//        System.out.println("weight : "+weight);
         super.atribute();
        System.out.println("gear : "+gear);
    }
}
