package Nikhil;
import static java.lang.System.*;
import java.util.*;
public class Dowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        do{
            out.println(i);
            i++;
        }while(i<=n);
    }
}
