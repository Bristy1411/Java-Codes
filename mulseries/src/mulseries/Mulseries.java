
package mulseries;
import java.util.Scanner;
class series{
    series(int n,int x,int y){
    System.out.print(x+" "+y);
    for(int i=0;i<n-2;i++){
        int a=x*y;
        System.out.print(" "+a);
        x=y;
        y=a;
    }
}
}
public class Mulseries {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int x=1;
       int y=2;
       series s= new series(n,x,y);
    }
    
}
