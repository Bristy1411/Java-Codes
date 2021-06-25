
package recarea2;

import java.util.Scanner;

class Rectangle{
    
    Rectangle(float length,float width)
    {
        float rectarea=length*width;
        System.out.println("Area of the Rectangle="+rectarea);
    }

}


public class Recarea2 {

    
    public static void main(String[] args) {
        
      Scanner Sc = new Scanner(System.in);
      
      System.out.println("Enter lenth:");
      float a= Sc.nextFloat();
      
      System.out.println("Enter width:");
      float b= Sc.nextFloat();
      
      Rectangle rect= new Rectangle(a,b);
      
    }
    
}
