package tasks.task12;

import java.util.Scanner;

public  class Input {
		
    private static final Scanner scanner = new Scanner(System.in);	
    
    public  static double inputDouble() {
             
           while (! scanner.hasNextDouble()) {
               scanner.next();
           }
           double x = scanner.nextDouble();		
           return x;				
     }
    
    public  static int inputInt() {
         
           while (! scanner.hasNextInt()) {
               scanner.next();
           }
           int x = scanner.nextInt();		
           return x;				
     }
    
    public static double inputPositiveDouble() {
           double result;

           do {
               result = inputDouble();
               
           } while (result <= 0);
           
           return result;
       }
    
    public static int inputPositiveInt() {
           int result;
           do {
               result = inputInt();
           } while (result < 0);
           
           return result;
       }
    
    public static String inputString() {
           String result;

           do {
               result = scanner.nextLine();
           } while (result.isEmpty());
           
           return result;
       }
    
    public  static int[] inputIntArray(int size) {
        
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
               System.out.print("Enter " + (i + 1) + " element out of " + array.length + ": ");
               array[i] =  inputInt();
           }
                   
           return array;				
     }
    
    public  static double[] inputDoubleArray(int size) {
        
        double[] array = new double[size];
        
        for (int i = 0; i < size; i++) {
               System.out.print("Enter " + (i + 1) + " element out of " + array.length + ": ");
               array[i] =  inputDouble();
           }
                   
           return array;				
     }
    
    public  static Book setInformationAboutBook() {
           
           String author;
           String title;
           int price;
           int isbn;

           System.out.print("Enter book title: ");
           title = Input.inputString();
           System.out.print("Enter book author: ");
           author = Input.inputString();
           System.out.print("Enter book price: ");
           price = Input.inputPositiveInt();
           System.out.print("Enter book ISBN: ");
           isbn = Input.inputPositiveInt();

           return new Book(title, author, price, isbn);
       }
}

