package tasks.task15.Classes;

import java.util.Comparator;
import tasks.task12.Book;

public class SortByAuthorThenTitleThenPrice  implements Comparator<Book> {
    private  Comparator<Book> comparator;
	
	public SortByAuthorThenTitleThenPrice(){
		
		comparator = new SortByAuthorThenTitle().thenComparing(new SortByPrice());
	
	}
	
	@Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Both books shouldn't be null");
        }

        return comparator.compare(book1, book2);
    }
}