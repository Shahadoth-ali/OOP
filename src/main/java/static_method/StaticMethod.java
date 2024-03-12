
package static_method;

public class StaticMethod {
    static int x=5;
    void display1(){
        System.out.println("this is non static method");
    }
    static void display3(){
        System.out.println("static method 3");
    }
   static void display2(){
//       display1(); call kora jabe na
         display3();
         System.out.println("x= "+x);
        System.out.println("this is static method");
    }
}
