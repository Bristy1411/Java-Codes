
package pkgabstract;
class A{
  void display(){
  System.out.println("Java");
  }
}
abstract class B{
    abstract void display();
    abstract int sum(int x,int y);
}
class C extends B{

    @Override
    void display() {
        System.out.println("java is good");
    }

    @Override
    int sum(int x, int y) {
        int z=x+y;
        return z;
    }
    


}

public class Abstract {

    
    public static void main(String[] args) {
     
        A obj = new A();
        C obj1 = new C();
        obj.display();
        obj1.display();
        int m=obj1.sum(5, 3);
        System.out.println("sum of the numbers= "+m);
                
}
}
