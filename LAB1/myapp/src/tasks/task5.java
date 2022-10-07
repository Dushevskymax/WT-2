package tasks;

import java.util.Scanner;

public class task5 {
    
    private static int getMinElements(int[] array){
        int maxIncLen = 0;
        int curInLen = 0;
        boolean isIncrease;
        for (int i=0; i< array.length; i++){
            array[i] = (int) Math.round((Math.random()*30)-10);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            isIncrease = true;
            curInLen = 1;
            for (int j = i + 1; (j < array.length) && isIncrease; j++) {
                if (array[j - 1] < array[j]) {
                	curInLen++;
                } else {
                    isIncrease = false;
                }
            }
            maxIncLen = Math.max(maxIncLen, curInLen);
        }
        return array.length - maxIncLen;
    }

    public static void main(String[] args) {
        System.out.println("Enter N: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int[] array = new int[N];
        System.out.println("\nMin Amount for extracting: " + getMinElements(array));

    }

}
