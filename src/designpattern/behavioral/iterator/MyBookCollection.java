package designpattern.behavioral.iterator;

public class MyBookCollection implements MyList<Book>{
	
	private Book[] books;

	public MyBookCollection(Book[] books) {
		this.books = books;
	}


	@Override
	public MyIterator<Book> iterator() {
	
		return new BookIterator(this.books);
	}

}
