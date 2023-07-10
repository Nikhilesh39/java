package Nikhil;
import static java.lang.System.*;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int h=n.nextInt();
        int[] a = new int[h];
        for(int i=0;i<h;i++) a[i] = n.nextInt();
        for(int i=0;i<h;i++) out.print(a[i] + "\t");

    }
}
