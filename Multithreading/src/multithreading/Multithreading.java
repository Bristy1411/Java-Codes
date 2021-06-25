
package multithreading;

class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("From thread A i="+i);
        }
        System.out.println("Exit from A");
    }
    
}
class B extends Thread{
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("From thread B j="+j);
        }
        System.out.println("Exit from B");
    }
}
class C extends Thread{
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("From thread C k="+k);
        }
        System.out.println("Exit from C");
    }
}

public class Multithreading {

    
    public static void main(String[] args) {
       A obj=new A();
       B obj1=new B();
       C obj2=new C();
       obj.start();
       obj1.start();
       obj2.start();
    }
    
}
