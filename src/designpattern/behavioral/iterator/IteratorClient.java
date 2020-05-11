package designpattern.behavioral.iterator;

public class IteratorClient {

	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		books[0]  = new Book("Meluha","9789385","Amish");
		books[1]  = new Book("Nagas","9789375","Amish");
		books[2]  = new Book("Sita","9789335","Amish");
		books[3]  = new Book("Raavan","9789395","Amish");
		books[4]  = new Book("Immortal India","9789315","Amish");
		
		
		MyList<Book> mylist = new MyBookCollection(books);
		
		MyIterator<Book> iterator = mylist.iterator();
		
		while(iterator.hasNaxt()) {
			Book book = iterator.next();
			System.out.println(book);
		}
	}
}
