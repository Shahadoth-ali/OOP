
package polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p=new Person();
         p.display();
         
        p=new Teacher();
//        Teacher t=new Teacher();
        p.display();
        p=new Student();
//        Student s=new Student();
         p.display();
        
       
//        t.display();
//        s.display();
    }
}
