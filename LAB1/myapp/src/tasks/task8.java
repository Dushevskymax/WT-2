package tasks;

import java.util.Scanner;
import java.util.Arrays;

public class task8 {
    private static void newArr(int[] A, int[] B){
        int length1 = A.length;
        int length2 = B.length;
        System.out.println("\n----Result----");
        for (int i = 0; i < length2; i++){
            for (int j = 0; j < length1; j++){
                if (B[i] == A[j]) {
                    System.out.println("B[" + i+"]:" + B[i] + "--> after A["+ j +"]:" + A[j]);
                }else if (B[i] < A[j] && B[i] >= A[j-1] && j != 0){
                    System.out.println("B[" + i+"]:" + B[i] + "--> before A[" + j +"]:" + A[j]);
                }
                else if ((B[i] > A[j] && B[i] < A[j+1]) || (B[i] > A[j] && A[j+1] == length1)){
                    System.out.println("B[" + i +"]:" + B[i] + "--> after A[" + j +"]:" + A[j]);
                }
            }
        }

    }

    private static void printArr(int[] A, int[] B){
        System.out.print("A: ");
        for (int i=0; i< A.length; i++){
           System.out.print(A[i] + " ");
        }
        System.out.println("\n-------------------------------------------");
        System.out.print("B: ");
        for (int i=0; i< B.length; i++){
            System.out.print(B[i] + " ");
        }
        newArr(A, B);
    }

    private static void fillArr(int[] A, int[] B){
        for (int i=0; i< A.length; i++){
            A[i] = (int) Math.round((Math.random()*30)-5);
        }
        Arrays.sort(A);
        for (int i=0; i< B.length; i++){
            B[i] = (int) Math.round((Math.random()*30)-5);
        }
        Arrays.sort(B);
        printArr(A, B);
    }

    public static void main(String[] args) {
        int N;
        int M;
        Scanner scan =  new Scanner(System.in);
        System.out.println("enter N, M (sizes of arrays)");
        N = scan.nextInt();
        M = scan.nextInt();
        System.out.println("--------------------------------------------");
        scan.close();
        int[] A =  new int[N];
        int[] B =  new int[M];
        fillArr(A, B);
        
    }
}
