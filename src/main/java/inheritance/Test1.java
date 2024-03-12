
package inheritance;

public class Test1 {
    public static void main(String[] args) {
        Teacher1 t=new Teacher1();
       t.setName("shahadoth");
       t.setAge(22);
       t.setQualification("bsc");
       
        System.out.println(t.getName());
        System.out.println(t.getAge());
        System.out.println(t.getQualification());
    }
}
