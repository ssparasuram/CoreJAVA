package designpattern.structural.composite;

public class CompositeClient {

	public static void main(String[] args) {
		
		Component kb = new leaf("KeyBoard", 100);
		Component mouse = new leaf("Mouse", 50);
		Component monitor = new leaf("Monitor", 200);
		Component ram = new leaf("RAM", 100);
		Component sd = new leaf("SDD", 150);
		
		
		Component peri = new Composite("Peripherals");
		
		Component cpu = new Composite("CPU");
		
		Component computer = new Composite("Computer");
		
		
		peri.addComponent(kb);
		peri.addComponent(mouse);
		peri.addComponent(monitor);
		
		System.out.println("*******************");
		peri.showPrice();
		System.out.println("*******************");
		
		cpu.addComponent(ram);
		cpu.addComponent(sd);
		
		System.out.println("*******************");
		cpu.showPrice();
		System.out.println("*******************");
		
		computer.addComponent(peri);
		
		computer.addComponent(cpu);
		
		System.out.println("*******************");
		computer.showPrice();
		System.out.println("*******************");

	}

}
