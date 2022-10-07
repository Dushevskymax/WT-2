package tasks;

import java.util.Scanner;

public class task6 {
 
    public static void main(String[] args) {
        int N;
        int tmp;
        Scanner scan =  new Scanner(System.in);
        System.out.println("enter N");
        N=scan.nextInt();
        int[][] array = new int[N][N];
        scan.close();
        for (int i = 0; i<N ; i++){
            tmp = i+1;
            for (int j = 0; j<N; j++){
                if (tmp > N) tmp = 1;
                array[i][j] = tmp;
                tmp++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
