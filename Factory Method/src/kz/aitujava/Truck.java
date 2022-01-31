package kz.aitujava;

// This concrete product provides 'Truck' implementations of the 'Transport' interface.
public class Truck implements Transport{
    public void deliver() {
        System.out.println("Truck delivers by land in a box.");
    }
}
