package tasks.task9;

import java.util.ArrayList;
import java.util.Scanner;

public class HowItWorks {

private static String what_characteristics(Ball ball){
    String str = "";
    switch(ball.Color){
        case 0: str = "White";break;
        case 1: str = "Red";break;
        case 2: str = "Blue";break;
        case 3: str = "Black";break;
        case 4: str = "Yellow"; break;
    }
    return str;

}

private static void fillList(ArrayList<Ball> balls, Basket basket){
   int size = basket.Size;
   int ranWeight = 0;
   int ranColor = 0;
   int ranSize = 0;
   while(size != 0){
        ranWeight = (int) Math.round((Math.random()*10)+1);
        ranColor = (int) Math.round((Math.random()*4));
        ranSize = (int) Math.round((Math.random()*size)+1);
        if (size >= ranSize){
            balls.add(new Ball(ranWeight ,ranSize, ranColor));
            size-=balls.get(balls.size() -1).Size;
        }
   }
   basket.Balls = balls;
}

private static void proc(int N){
    Basket basket = new Basket(N);
    ArrayList<Ball> balls = new ArrayList<>();
    fillList(balls, basket);
    System.out.println("---Print_result----");
    System.out.println(basket.Size);
    for (Ball ball : basket.Balls) {
        System.out.println("Color: " + what_characteristics(ball) +"     "+ "Weight: " + ball.Weight + "     "+ "Size: " + ball.Size);
    }
}

public static void main(String[] args) {
    System.out.println("----Task9----");
    Scanner scanner = new Scanner(System.in);
    proc(scanner.nextInt());
    scanner.close();
}

}