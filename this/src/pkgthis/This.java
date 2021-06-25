
package pkgthis;
class A{
int a,b;
int getdata(int a,int b){
    this.a=a;
    this.b=b;
    return 0;
}
}

public class This {

   
    public static void main(String[] args) {
        
        A obj = new A();
        obj.getdata(5, 4);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
    
}
