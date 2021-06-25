
package pkgfinal;
final class A{
  void display(){
  System.out.println("Java");
  }
}
class B{
    final void disply(){
        System.out.println("Java is good");
    } 
    int sum(int x, int y){
    return x+y;
    }
}
class C extends B{
    int c=sum(5,3);
int add(int b){
 int a=b+c;
 return a;
}
}

public class Final {

    
    public static void main(String[] args) {
        B obj = new B();
        C obj1 = new C();
        obj.disply();
        int d=obj1.add(2);
        System.out.println("result is = "+d);
    }
    
}
