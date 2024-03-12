
package encapsulation;

/**
 *
 * @author Shahadath Ali
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
       p1.setName("shahadoth");
        System.out.println("name is :"+p1.getName());
        p1.setAge(22);
        System.out.println("age is :"+ p1.getAge());
    }
}