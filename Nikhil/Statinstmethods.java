package Nikhil;

class One5 {
    int a,b;
    static int s;
    void display(){
        System.out.println(s);// can access instance variables using instance methods
    }
    static void get(){
        System.out.println(s);
    }
}
class Statinstmethods{
    public static void main(String[] args) {
        System.out.println(One5.s);// can be accessed even without creating a reference variable as memory is allocated during loading
        One5.get();
        One5 a = new One5();
        a.display();
    }
}