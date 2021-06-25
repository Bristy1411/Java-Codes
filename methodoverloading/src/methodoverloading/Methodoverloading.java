
package methodoverloading;
 
class method{
 int add(int x,int y){
     return x+y;
 }
 int add(int x,int y,int z){
     return x+y+z;
 }
}

public class Methodoverloading {

    
    public static void main(String[] args) {
        method add1 = new method();
        method add2 = new method();
        int sum = add1.add(4,6);
        System.out.println("sum of two number = "+sum);
        int sum1 = add2.add(4,6,5);
        System.out.println("sum of three number = "+sum1);
    }
    
}
