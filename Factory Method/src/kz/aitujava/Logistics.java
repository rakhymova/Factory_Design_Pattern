package kz.aitujava;

// This is the Factory class which returns an object of a product class
public abstract class Logistics {
    public void planDelivery() {
        Transport t = createTransport(); // t object calls for a factory(Logistics) method 'createTransport'
        t.deliver();
    }
    public abstract Transport createTransport();
}
