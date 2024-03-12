
package static_variable;

public class Student {
   static int count=0;//non static
    
    Student(){
        count++;
    }
    void totalStudent(){
        System.out.println("total st :"+count);
    }
}
