
package anonymous;

public class Test {
    public static void main(String[] args) {
        //ekhane object er sathei class create korchi
        Person p=new Person(){
            
            @Override
            void display(){
                System.out.println("test class");
            }
        };
        p.display();
    }
}
