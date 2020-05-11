package designpattern.behavioral.iterator;

public interface MyIterator<E> {
	
	void reset(); // first element
	
	E next();
	
	boolean hasNaxt();
	

}
