
package method_overriding;

public class Test {
    public static void main(String[] args) {
        Teacher t=new Teacher();
       t.name="shahadoth";
       t.age=22;
       t.qualification="bsc";
       t.displayInfo();
        
       Person p=new Person();
       p.name="shahadoth";
       p.age=23;
       p.displayInfo();
    }
}
