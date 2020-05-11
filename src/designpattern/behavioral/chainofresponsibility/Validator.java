package designpattern.behavioral.chainofresponsibility;

public abstract class Validator {
	
	private Validator next;
	
	public Validator addNecxt(Validator validator) {
		this.next = validator;
		return this.next;
	}
	
	public abstract boolean check(User user);
	
	
	public boolean checkNext(User user) {
		if(next == null) {
			return true;
		}
		return next.check(user);
	}
	

}
