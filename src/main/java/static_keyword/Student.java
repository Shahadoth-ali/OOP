
package static_keyword;

public class Student {
   String name;
   int id;
   static String universityName="cuet";
   
   Student(String n,int i){
      name=n;
      id=i;
   }
   
   void displayInfo(){
       System.out.println("name is :"+name);
       System.out.println("id is :"+id);
       System.out.println("University is :"+universityName);
   }
}
