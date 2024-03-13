
package abstraction;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape;
        shape=new Rectangle(10,20);
        shape.area();
        shape=new Circle(5);
        shape.area();
        shape=new Triangle(2,3);
        shape.area();
    }
}
