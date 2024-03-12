
package overloading_constructor;

public class Teacher {
    String name;
    String gender;
    int phone;
    
    Teacher(){
        System.out.println("no value");
    }
    Teacher(String n,String g){
        name=n;
        gender=g;
    }
    Teacher(String n,String g,int ph){
        name=n;
        gender=g;
        phone=ph;
    }
    
    void displayInfo(){
        System.out.println("name is :"+name);
        System.out.println("gender is :"+gender);
        System.out.println("phone is :"+phone);
    }
}
