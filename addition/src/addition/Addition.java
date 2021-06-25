
package addition;

import java.util.Scanner;

class add{
   int sum(int x,int y)
   {
       int s=x+y;
       System.out .println("The sum is="+s);
       return 0;
   }
}
public class Addition {
    public static void main(String[] args) {
       add ad = new add();
       Scanner Sc = new Scanner(System.in);
       int a = Sc.nextInt();
       int b = Sc.nextInt();
       ad.sum(a,b);
    } 
}
