package Nikhil;
import static java.lang.System.*;
import java.io.*;

public class ReadData1 {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(in);// input is changed to character stream
        BufferedReader br = new BufferedReader(isr);
        // 'in' is byte stream, BufferedReader is character stream
        // so it needs to be changed
        out.print("Enter ename : ");
        String ename=br.readLine();

        out.print("Enter salary : ");
        float sal=Float.parseFloat(br.readLine());

        out.println("Ename : "+ename);
        out.print("Esal : "+sal);
    }
}
