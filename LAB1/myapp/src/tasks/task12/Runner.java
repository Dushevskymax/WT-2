package tasks.task12;

public class Runner {
    public static void main(String[] args) {
        Book book1;
			Book book2;
			
			
			System.out.print("Enter book edition: ");
		    Book.setEdition(Input.inputPositiveInt());
		        
	        try {
	        	
	            System.out.println("Set information about first book");
	            book1 = Input.setInformationAboutBook();
	            
	            System.out.println("Set information about second book");
	            book2 = Input.setInformationAboutBook();
	            
	        } catch (IllegalArgumentException e) {
	        	
	            System.out.println( e.getMessage());
	            return;
	        }

	        
	        System.out.println("Books hash codes:");
	        System.out.println("Book 1 hashCode: " + book1.hashCode());
	        System.out.println("Book 2 hashCode: " + book2.hashCode());

	        System.out.println("Are books equal? " + book1.equals(book2));

	        System.out.println("Ñompare books: " + book1.compareTo(book2));
    }
}
