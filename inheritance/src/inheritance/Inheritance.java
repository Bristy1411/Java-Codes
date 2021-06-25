
package inheritance;
 class A{
 int length,width;
 void getdata(int x,int y){
      length=x;
      width=y;
   }
 int getarea(){
     return length*width;
   }
 }
class B extends A{
int getvolume(int h){
     getdata(5,1);
     return h*getarea();
}
}
public class Inheritance {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        obj.getdata(5, 2);
        int area=obj.getarea();
        System.out.println("Area = "+area);
        int volume=obj1.getvolume(6);
        System.out.println("Volume = "+volume);
    }
}
