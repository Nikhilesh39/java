package Nikhil;
import static java.lang.System.*;

class Emp2 implements Comparable<Emp2>{
    int eno;
    String ename;
    float sal;
     Emp2(int eno,String ename,float sal){
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;
    }
    @Override
    public int compareTo(Emp2 e2){
         return this.eno-e2.eno;
    }
    public String toString(){
         return "One@[Eno="+eno+",Ename="+ename+",Sal="+sal+"]";
    }
}
public class PriorityQDemo {
    public static void main(String[] args) {
        /*Emp2 e1= new Emp2(3,"Rhys",100000.00f);
        Emp2 e2= new Emp2(1,"Rhys",100000.00f);*/
        Emp2 e2= new Emp2(3,"Rhys",100000.00f);
        Emp2 e1= new Emp2(1,"Rhys",100000.00f);
        // the comparison is done based on the eno
        out.println(e1);
        out.println(e2);
        String name = "Rhys";
        out.println(name.toString());

        Integer io=1000;// or Integer io = Integer(1000);
        out.println(io.toString());

    }
}
