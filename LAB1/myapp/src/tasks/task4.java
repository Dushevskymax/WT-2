package tasks;

import java.util.Scanner;

public class task4 {
    private static boolean Isprime(int x){
        for (int i = 2; i<=Math.sqrt(x); i++){
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int N;
        Scanner scan =  new Scanner(System.in);
        System.out.println("enter N");
        N = scan.nextInt();
        int[] MyArray = new int[N];
        scan.close();
        for (int i = 0; i < MyArray.length; i++){
            MyArray[i] = (int) Math.round((Math.random() * 100) -10);
            System.out.print(MyArray[i] + " ");
        }
        System.out.println();
        System.out.println("i value");
        for (int i = 0; i < MyArray.length; i++){
            if (Isprime(MyArray[i])){
                System.out.println(i+ " "+ MyArray[i]);
            }
        }
    }
}
