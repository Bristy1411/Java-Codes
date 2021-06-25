
package nestedtry;
public class Nestedtry {
    public static void main(String[] args) {
        int x=10,y=5,z=5;
        try {
            int a=x/y;
            System.out.println("a="+a);
            int b=x/(z-y);
            System.out.println("b="+b);
        } catch(ArithmeticException e){
            System.out.println("Divided by zero");
        }}}
