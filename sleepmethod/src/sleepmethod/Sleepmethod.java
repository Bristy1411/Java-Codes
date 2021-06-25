
package sleepmethod;

import java.util.logging.Level;
import java.util.logging.Logger;

class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("i="+i);
            if(i==3){
                for(int j=1;j<=5;j++){
                    System.out.println("j="+j);
                    if(j==3)
                       try {
                           sleep(3000);
                    } catch (InterruptedException ex) {}
                }
            }
        }
       
    }
    
}

public class Sleepmethod {

   
    public static void main(String[] args) {
      A obj=new A();
        obj.start();
    }
    
}
