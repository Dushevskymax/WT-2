package tasks;

import java.util.Scanner;

public class task7 {
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void ShellSort(int[] array){
        int h = 1;
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int N;
        Scanner scan =  new Scanner(System.in);
        System.out.println("enter N");
        N=scan.nextInt();
        scan.close();
        int[] array = new int[N];
        for (int i=0; i< N; i++){
            array[i] = (int) Math.round((Math.random()*30)-10);
            System.out.print(array[i] + " ");
        }
        ShellSort(array);
        System.out.println();
        for (int i= 0; i<N; i++){
            System.out.print(array[i] + " ");
        }

    }

}
