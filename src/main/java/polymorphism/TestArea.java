
package polymorphism;

public class TestArea {
    public static void main(String[] args) {
        Shape[] s=new Shape[3];
        s[0]=new Shape();
        s[1]=new Rectangle(10,10);
        s[2]=new Triangle(10,5);
//        Shape s=new Shape();
//        
//        Shape r=new Rectangle(10,10);
//        Shape t=new Triangle(10,5);
        
//        System.out.println( s.area());
//        System.out.println(r.area());
//        System.out.println(t.area());
          for (int i = 0; i < 3; i++) {
              System.out.println(s[i].area());
        }
    }
}
