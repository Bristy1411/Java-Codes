
package java_constructor;
import java.util.Date;

class Person{
    public String name;
    public Date dateOfBirth;
    public Person(){
        this.name = "Not Set";
        this.dateOfBirth = new Date();
    }
    //creating a constructor
    public Person(String name, Date dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}
class Employee extends Person{
    public int employeID;
    public double salary;
    public Date dateOfJoining;
    
    public Employee(){
        this.employeID = 0;
        this.salary = 0;
        this.dateOfBirth = new Date();
    }
    public Employee(String name, Date dateOfBirth, int employeID, double salary, Date dateOfJoining){
        super(name, dateOfBirth);
        this.employeID = employeID;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }
    public void display()
    {
    System.out.println("Name= "+name);
    System.out.println("Date date Of Birth= "+dateOfBirth);
    System.out.println("Employe ID= "+employeID);
    System.out.println("Salary= "+salary);
    System.out.println("Date date Of Joining= "+dateOfJoining);
    }
}
public class Java_constructor {

   
    public static void main(String[] args) {
        Employee e= new Employee("Bristy", new Date(98,10,14), 171442105, 10000,new Date());
        e.display();
        
    }
    
}
