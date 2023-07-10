package Nikhil;
import static java.lang.System.*;

class Houseplan {// this class has field, methods and constructors
    // instatnce fields
    byte prayerRoom;//1 byte
    short kitchen;//2 bytes
    int br1,br2;//4 bytes
    long hall;//8 bytes
    //default values are assigned to the above which is 0
    // instance constructor
    Houseplan(){//matches with class name, it is a constructor
        out.println("Constructor is invoked");
    }
    // instance methods
    void pray(){
        out.println("We pray for cars");
    }
    void cook(){
        out.println("Bib's");
    }
    void watch(){
        out.println("Hammer-time");
    }
    void rest(){
        out.println("Rest in peace");
    }
}
// This is the main program.
class Wayne{
    public static void main(String[] args) {
        // reference variable declared using class
        // escala is a reference variable, can use class name to declare that
        // Houseplan is a class name so declaring reference variable escala with it
        // it makes Houseplan a datatype
        // which is why class is called as a user defined data type
        // defualt value for reference variable is null
        Houseplan Escala = new Houseplan();
        Houseplan r1= null;
        Escala.pray();
        Escala.cook();
        Escala.watch();// null can also be stored in reference variable
        //new operator allocates memory for the instance variables in the class
        // it is a constructor calling statement
    }
}
