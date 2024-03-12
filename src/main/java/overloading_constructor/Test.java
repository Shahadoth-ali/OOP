
package overloading_constructor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        
        Teacher teacher2=new Teacher("shahadoth","male");
        teacher2.displayInfo();
        
        Teacher teacher3=new Teacher("rojina","female",3458993);
        teacher3.displayInfo();
        
    }
}
