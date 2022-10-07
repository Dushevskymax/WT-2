package tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x");
        double x = scan.nextDouble();
        System.out.println("Enter y");
        double y = scan.nextDouble();
        scan.close();
        double result = (1 + Math.pow(Math.sin((double)x+(double)y),2)) / (2 + Math.abs(x-(2*x/(1+x*x*y*y)))) ;
        System.out.println(result);
        
    }
}
