
package java_trycatch;


public class Java_TryCatch {

    
    public static void main(String[] args) {
        try{
            int a = 0;
            int b= 4/a;
            System.out.println("b: "+b);
            
        }catch(ArithmeticException e){
            System.out.println("Divided by zero");
        }
        System.out.println("Exception handled by Try-Catch.");
    }
    
}
