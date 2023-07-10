package Nikhil;


import static java.lang.System.*;
interface Shape{
    void draw();
}
class Rectangle implements Shape{
    public void draw(){
        out.println("Rectangle is drawn");
    }
}
class Circle implements Shape{
    public void draw(){
        out.println("Circle is drawn");
    }
}
class Square implements Shape{
    public void draw(){
        out.println("Square is drawn");
    }
}
class Drawing{
    static Shape getShape(int opt){
        // dont know whic type to give so giving the common base type for getShape
        Shape s=null;
        if(opt==1)
            s = new Rectangle();
        else if(opt ==2)
            s = new Circle();
        else if(opt==3)
            s = new Square();
        return s;
    }
}
public class AbstractionthroughINFS {
    public static void main(String[] args) {
        Shape si = Drawing.getShape(1);
        si.draw();
        /*Drawing.getShape(1);
        Drawing.getShape(2);
        Drawing.getShape(3);
    }*/
    }
}

