
package mainclass;
abstract class A{
    abstract void firstMethod();
    void secondmethod(){
        System.out.println("SECOND");
       firstMethod();
   }}
abstract class B extends A{
    void firstMethod(){
        System.out.println("FIRST");
        thirdMethod();
    }
       abstract void thirdMethod();
}
class C extends B{
    void thirdMethod(){
        System.out.println("Third");
    }}
public class Mainclass {
    public static void main(String[] args) {
       C c= new C();
       c.firstMethod();
       c.secondmethod();
       c.thirdMethod();
    }}
