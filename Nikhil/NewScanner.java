package Nikhil;

import java.util.Scanner;

public class NewScanner {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter roll : ");
        int num = n.nextInt();
        System.out.println("Enter Name : ");
        String name = n.next();
        System.out.println("Enter sal : ");
        float sal = n.nextFloat();
        System.out.printf("%d %s %.2f",num,name,sal);
    }
}
