package tasks.task15;

import java.util.ArrayList;
import java.util.Comparator;

import tasks.task12.Book;
import tasks.task12.Input;
import tasks.task15.Classes.SortByAuthorThenTitle;
import tasks.task15.Classes.SortByAuthorThenTitleThenPrice;
import tasks.task15.Classes.SortByTitleThenAuthor;
import tasks.task15.Classes.SortByTitle;


public class Runner {
    public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<Book>();
        int booksCount;
        
        ArrayList<Comparator<Book>> comparators = getComp();

        System.out.print("Enter number of books to sort: ");
        booksCount = Input.inputPositiveInt();

        for (int i = 0; i < booksCount; i++) {
            try {
                System.out.println("Enter book " + (i + 1) + " out of " + booksCount );
                bookList.add(Input.setInformationAboutBook());
                
            } catch (IllegalArgumentException e) {
                System.out.println("Input error: " + e.getMessage());
                i--;
            }
        }

        for (Comparator<Book> comparator : comparators) {
            bookList.sort(comparator);
            System.out.println(comparator.getClass().getName());
            for (Book book : bookList) {  
                System.out.println("title: "+ book.getTitle() + " author: "+ book.getAuthor()+ " price: "+ book.getPrice()
                 );
               
            }
        }

	}
	
	 private static ArrayList<Comparator<Book>> getComp() {
	        ArrayList<Comparator<Book>> comparators = new ArrayList<>();

	        comparators.add(new SortByAuthorThenTitle());
	        comparators.add(new SortByAuthorThenTitleThenPrice());
	        comparators.add(new SortByTitle());
	        comparators.add(new SortByTitleThenAuthor());
	        return comparators;
	    }
}
