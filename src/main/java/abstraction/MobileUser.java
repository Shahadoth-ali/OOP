
package abstraction;

public abstract class MobileUser {
    abstract void sendMessage();
    void call(){
        System.out.println("i am non abstract method");
    }
}
