
package method_overriding;

public class Teacher extends Person{
    //name,age,displayInfo()
    String qualification;
    
    @Override
     void displayInfo(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("qualification : "+qualification);
    }
}
