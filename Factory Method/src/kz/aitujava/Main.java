package kz.aitujava;

public class Main {

    public static void main(String[] args) {
	Logistics log = new RoadLogistics();
	log.planDelivery();
	Logistics log2 = new SeaLogistics();
	log2.planDelivery();
    }
}
