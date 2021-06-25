
package Aseries;
import java.util.Scanner;
class series{
 void newseries(int n,int x,int y){
    for(int i=0;i<n-2;i++){
        int a=x*y;
        System.out.print(" "+a);
        x=y;
        y=a;
    }
}
}
public class Series {

    public static void main(String[] args) {
        series s= new series();
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int x=1;
       int y=2;
       s.newseries(n, x, y);
       
    }
    
}
