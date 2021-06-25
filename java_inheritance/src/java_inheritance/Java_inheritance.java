
package java_inheritance;
class Vehicle{
    int maxSpeed, nOfPassanger;
    public void display(){
        System.out.println("Passangers = " + maxSpeed);
        System.out.println("Maxspeed = " + nOfPassanger);
    }
}

class Car extends Vehicle{
    String carName;
    @Override
    public void display(){
        System.out.println("Passangers = " + maxSpeed);
        System.out.println("Maxspeed = " + nOfPassanger);
        System.out.println("Car Name = " + carName);
    }
}
public class Java_inheritance {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.maxSpeed = 50;
        v.nOfPassanger = 10;
        System.out.println("----Vehicle----");
        v.display();
        
        Car c = new Car();
        c.maxSpeed = 120;
        c.nOfPassanger = 2;
        c.carName = "Audi";
        System.out.println("------Car------");
        c.display();
    }
}
