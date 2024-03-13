
package modifier1;


public class A {
    //private member same package er
    //onno class hoteo access hbe na
    //eta sudhu ai class ei use hbe
    private void display(){
        System.out.println("from a");
    }
    //PUBLIC sob jayga hote access hbe
    public void display1(){
        System.out.println("from A");
    }
    //same class e use kora jabe
    //same package er onno class e use hbe
    //onno package er class eta use korte chaile
    //age ai package import korte hbe
    //then ai class k inherit korte hbe
    protected void display2(){
        System.out.println("from A protected");
    }
    //default sudhu akoi package e use hbe
    void display3(){
        System.out.println("hello");
    }
}
