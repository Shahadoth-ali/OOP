
package abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser mu;
        mu=new Karim();
        mu.sendMessage();
        mu.call();
        
        mu=new Rahim();
        mu.sendMessage();
    }
}
