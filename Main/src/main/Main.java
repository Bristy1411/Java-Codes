
package main;
public class Main {
    public static void main(String[] args) {
      circle circleshape=new circle();
      circleshape.Draw();
      circleshape.Draw();
    }}
interface shapeA{
    public static String baseclass="shape";
    public void Draw();
}
interface shapeB extends shapeA{
    public static String baseclass="shape2";
    public void Draw2();
}
class circle implements shapeB{
    public static String baseclass="shape3";
    public void Draw() {
       System.out.println("Drawing circle here:"+baseclass);
    }
    public void Draw2() {
        System.out.println("Drawing circle here:"+baseclass);
    } }

