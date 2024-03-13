
package this_keyword;

public class Person {
 
    void message(){
        System.out.println("i am message method");
    }
   
    void display(){
        message();//this na dileo kaj hoy
        System.out.println("i am display method");
    }
}
