package tasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int a;
        int b;
        double h;
        double res;
        String str1;
        String str2;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a");
        a = scan.nextInt();
        System.out.println("enter b");
        b = scan.nextInt();
        System.out.println("enter h");
        h = scan.nextDouble();
        scan.close();
        System.out.println("------------result------------");
        System.out.println("x        h");
        for (double x = a; x < b; x+=h){
            res = Math.tan(x);
            str1 = String.format("%.2f", res);
            str2 = String.format("%.2f", x);
            System.out.println(str2 + "  |  " + str1);
        }
        
    }
}
