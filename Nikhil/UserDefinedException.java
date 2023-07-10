package Nikhil;
import static java.lang.System.*;
// Unreported exception
class ZeroException extends Exception
{
    ZeroException(String cause){
        super(cause);//passed to exception class and then to throwable class and then to object class
    }
}
class Calc{
    static void div()throws ZeroException
    // it is an unreported exception
    // meaning of the above line : if ZeroException occurs in the div()method throw that exception out
    // it is thrown to where the div() method has been called, in this case it is main() method
    {
        int a=10,b=0,c=0;
        if(b==0)
            throw new ZeroException("b is zero");//default constructor is present in the ZeroException class
        c=a/b;
    }
}
public class UserDefinedException {
    public static void main(String[] args) {// should not write 'throws ZeroException' as it will send to JVM which will stop the program at error
        try {
            Calc.div();
        }
        catch (ZeroException ze) {
            ze.printStackTrace();
        }
    }
}
