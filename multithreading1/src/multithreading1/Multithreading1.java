
package multithreading1;

class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("i="+i);
            if(i==3){
                for(int j=1;j<=5;j++){
                    System.out.println("j="+j);
                    if(j==3)
                        stop();
                }
            }
        }
       
    }
    
}
public class Multithreading1 {

    
    public static void main(String[] args) {
        A obj=new A();
        obj.start();
        obj.yield();
    }
    
}
