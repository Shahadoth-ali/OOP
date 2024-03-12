
package callbyvalue_refference;


public class ValueTest {
    public static void main(String[] args) {
        CallByValue ob=new CallByValue();
        int x=10;
        System.out.println("before calling :"+x);
        
        ob.change(x);
        System.out.println("after calling :"+x);
    }
  
}
