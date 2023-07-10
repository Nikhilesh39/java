package Nikhil;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(Swap1(a,b));
    }
    static int Swap1(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        return a;// java cannot return multiple values
    }
}
