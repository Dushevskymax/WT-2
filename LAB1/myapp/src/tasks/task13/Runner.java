package tasks.task13;

import tasks.task12.Book;
import tasks.task12.Input;

public class Runner {
    public static void main(String[] args) {
        Book book1;
		Book book2;
		
		
		System.out.print("Enter book edition: ");
	    Book.setEdition(Input.inputPositiveInt());
	        
        try {
        	
            System.out.println("Set information about first book");
            book1 = Input.setInformationAboutBook();
            System.out.print("Enter book language: ");
            String language = Input.inputString();
            System.out.print("Enter book level: ");
            int level = Input.inputPositiveInt();
            book1 = new ProgrammerBook(book1 ,language, level);
            
            System.out.println("Set information about second book");
            book2 = Input.setInformationAboutBook();
            System.out.print("Enter book language: ");
            String language1 = Input.inputString();
            System.out.print("Enter book level: ");
            int level1 = Input.inputPositiveInt();
            book2 = new ProgrammerBook(book2 ,language1, level1);
            
        } catch (IllegalArgumentException e) {
        	
            System.out.println( e.getMessage());
            return;
        }

        System.out.println("Information about first book "+ book1.toString());
        System.out.println("Information about second book "+ book2.toString());
        System.out.println("Books hash codes:");
        System.out.println("Book 1 hashCode: " + book1.hashCode());
        System.out.println("Book 2 hashCode: " + book2.hashCode());

        System.out.println("Are books equal? " + book1.equals(book2));
    }
}
