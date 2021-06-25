
package exam;
public class Exam {
    public static void main(String[] args) {
        int num1=30,num2=0,a[]=new int[10];
        try{
             int output1=num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println("Divided by zero");
        }
        try {
             a[11]=9;
             int output2=a[11]+num1;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array Index Out Of Bounds"); 
        }
    }}
