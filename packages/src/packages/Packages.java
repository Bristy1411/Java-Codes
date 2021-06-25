
package packages;
import newpackage.Volume;
import packages.newpackage.Area;
public class Packages {  
    public static void main(String[] args) {
        Area obj =new Area();
        Volume obj1 =new Volume();
        int x=obj.area(5, 2);
        int y=obj1.volume(3, 10);
        System.out.println("Area="+x);
        System.out.println("Volume="+y);
    } 
}
