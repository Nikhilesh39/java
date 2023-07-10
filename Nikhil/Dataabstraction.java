package Nikhil;
import java.lang.System.*;
class Student {
    private int s1,s2,s3; // data hiding
    Student(int s1,int s2,int s3){// hiding the data as it seemed unecessary or for security purposes
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    private int Total(){// hiding the coding as it seemed unecessary or for security purposes
    return s1+s2+s3;
    }
    private float getAvg(){
        return Total()/3.0f;
        }
    private boolean isPass(){
        if(s1>=40 && s3>=40 && s2>=40){
            return true;
        }
        else
            return false;
        }
    void result(){
        if(isPass()){
            System.out.println("Total : "+Total());
            System.out.println("Avg : "+getAvg());
            System.out.println("Result : Pass");
        }
        else
            System.out.println("Result : Fail");
        }
}
public class Dataabstraction {
    public static void main(String[] args) {
        Student s = new Student(50,50,50);
        s.result();
    }
}

