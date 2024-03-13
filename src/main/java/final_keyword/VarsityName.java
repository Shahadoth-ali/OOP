
package final_keyword;

public class VarsityName {
   final String name="cuet";//next e eta change hbe na.
   final int fee;//-->blank final variable initialize hoy constructor dara
//    int fee=4500
   static final int students;//eta initialize hbe static block daara
   
   static{
       students=4000;
   }
    
    VarsityName(){
        fee=4500;
    }
    
    void display(){
        System.out.println("name : "+name);
        System.out.println("fee : "+fee);
    }
}
