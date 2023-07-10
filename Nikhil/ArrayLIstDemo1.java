package Nikhil;
import java.util.*;
import static java.lang.System.*;

public class ArrayLIstDemo1 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        List al = Collections.synchronizedList(al1);
        out.println("Size of al:" + al.size());
        al.add("Mad");
        al.add("King");
        al.add("Harry");
        al.add("lost");
        al.add("Paradise");
        out.println("Size of al:" + al.size());
        out.println(al);
    }
}