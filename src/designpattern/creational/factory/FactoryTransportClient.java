package designpattern.creational.factory;

public class FactoryTransportClient {

	public static void main(String[] args) {

		Transport oceanTransport = TransportFactory.getInstance("Ocean");

		System.out.println(oceanTransport.trnasportMode());

		Transport roadTransport = TransportFactory.getInstance("Road");

		System.out.println(roadTransport.trnasportMode());

	}

}
