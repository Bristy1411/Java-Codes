
package pkginterface;

interface X
{
   int area(int x, int y);
}
interface Y extends X
{
   void disply();
}
class Area implements X, Y
{
    int a;
    @Override
    public int area(int x, int y) {
        a=x*y;
        return a;
    }

    @Override
    public void disply() {
        System.out.print("Area="+a);
    }

}
public class Interface {

    public static void main(String[] args) {
         Area obj = new Area();
         Y arr=obj;
         arr.area(5, 2);
         arr.disply();
    }
    
}
