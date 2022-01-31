package kz.aitujava;

// This concrete product provides 'Ship' implementations of the 'Transport' interface.
public class Ship implements Transport{
    public void deliver() {
        System.out.println("Ship delivers by sea in a container.");
    }
}
