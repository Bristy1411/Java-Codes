
package fibonacci;
import java.util.Scanner;
class febonac{
 
   void feb(int n)
   {
       int a=0,b=1,sum;
       for(int x=1;x<=n-2;x++)
       {
           sum=a+b;
           System.out.print(" "+sum);
           a=b;
           b=sum;
       }
   }

}
public class Fibonacci {

   
    public static void main(String[] args) {
        
        febonac f= new febonac();
        Scanner Sc = new Scanner(System.in);
        int n=Sc.nextInt();
        System.out.print("Fibonacci series:0 1");
        f.feb(n);
    }
    
}
