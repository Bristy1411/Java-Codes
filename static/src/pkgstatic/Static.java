
package pkgstatic;
class varsity{
    static int count;
    static void student(int x){
        System.out.println("Total student in varsity = "+x);
    }
     static int student;
    int cse (int male,int female){
        student=male+female;
        return student;
    }
    int cse(int teacher){
        int members=teacher+student;
        return members;
    }
}
class CSEdept extends varsity{
        static void student(){
        System.out.println("Total student in CSE Dept = "+student);
    } 
}
public class Static {
    public static void main(String[] args) {
        CSEdept obj = new CSEdept();
        varsity.student(100);
        obj.cse(42, 5);
        int member=obj.cse(17);
        obj.student();
        System.out.println("Total member in CSE dept = "+member);
    }
    
}
