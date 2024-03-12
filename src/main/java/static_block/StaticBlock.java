
package static_block;

public class StaticBlock {
   static int id;
   static String name;
   
   static{
       id=117;
       name="shahadoth";
   }
   static{
       System.out.println("static block");
   }
   
  static void display(){
       System.out.println("id is :"+id);
       System.out.println("name is :"+name);
   }
    public static void main(String[] args) {
        StaticBlock.display();
        System.out.println("main method");
    }
}
