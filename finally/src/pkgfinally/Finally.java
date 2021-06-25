
package pkgfinally;
public class Finally {
    public static void main(String[] args) {
       int num1=30,num2=0,a[]=new int[10];
        try{
             int output1=num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println("divided by zero");
        }
        finally{
            int output2=num1+num2;
            System.out.println("result"+output2);
        }
    }
    
}
