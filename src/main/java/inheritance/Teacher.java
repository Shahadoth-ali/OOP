
package inheritance;

public class Teacher extends Person{
    //name,age,displayInfo()
    String qualification;
    
    void displayInfo2(){
      displayInfo();
        System.out.println("qualification is:"+qualification);
    }
}
