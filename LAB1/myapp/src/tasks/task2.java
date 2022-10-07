package tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter x");
        x=scan.nextInt();
        System.out.println("enter y");
        y=scan.nextInt();
        scan.close();
        if (x > -6 || x < 6  || y > -3  || y < 5 ){
            System.out.println("true");
        } 
        else{
            System.out.println("false");
        }
    }
}
