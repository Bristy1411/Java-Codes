
package recarea1;

import java.util.Scanner;

class Rectangle{
    float length,width;
    void getdata(float x, float y)
    {
        length=x;
        width=y;
    }
    float getarea()
    {
        float rectarea=length*width;
        return rectarea;
    }

}

public class Recarea1 {

    
    public static void main(String[] args) {
        
      Rectangle rect= new Rectangle();
      Scanner Sc = new Scanner(System.in);
      
      System.out.println("Enter lenth:");
      float a= Sc.nextFloat();
      
      System.out.println("Enter width:");
      float b= Sc.nextFloat();
      
      rect.getdata(a,b);
      float area=rect.getarea();
      System.out.println("Area of the Rectangle="+area);
      
    }
    
}
