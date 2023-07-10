package Nikhil;
import java.io.*;
import static java.lang.System.*;

public class FileDemo {
    public static void main(String[] args)throws IOException {
        /*the code throws an IOException to indicate that an
        exception may occur during file operations, and it should be handled.*/

        /*File f=new File("Data.txt");// creating file using program, and storing its address in f
        f.createNewFile();
        out.println("file is created");*/
        FileInputStream fis = new FileInputStream("Data.txt");
        FileOutputStream fos = new FileOutputStream("Rhys.txt");// data is written into this file
        int r; //= fis.read();// read()method reads single character at a time
        //out.println(r);// gives ASCII value for 'B'
        // if read()method gives us/returns -1, then it means end of the file
        while((r=fis.read())!=-1){
            //out.print(r+" ");//ASCII VALUES
            out.print((char)r+" ");// (char)r typecasting
            fos.write(r);
            // written into the fill whose address is stored in the fos, fos is a stream
        }
        fis.close();
        fos.close();
        // IOException arises when reading and writing of data is done through a close stream
        /*closing the input and output stream as
        some memory is allocated in the heap memory for those streams*/
        out.println();
        out.println("Copy paste done . . ");
    }
}
