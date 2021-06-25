
package multipleinheritance;
interface A{
    void disply();
}
interface B extends A {
    int area(int x,int y);
}

interface C extends A{
    int volum(int a,int h);
}
class D implements B,C {

    int a,v;
    public int area(int x, int y) {
         a=x*y;
         return a;
    }
    public int volum(int a, int h) {
        v=a*h;
        return v;
    }
    public void disply() {
        System.out.println("Area="+a+"\nVolume="+v); 
    } 
}

public class Multipleinheritance {
   
    public static void main(String[] args) {
        D obj =new D();
        obj.area(5, 2);
        obj.volum(10, 5);
        obj.disply();
    }
}
