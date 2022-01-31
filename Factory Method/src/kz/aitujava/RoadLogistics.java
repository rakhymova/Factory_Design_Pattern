package kz.aitujava;

// Concrete creator RoadLogistics overrides the factory(Logistics) method to change the
// resulting product's type to 'Truck'.
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
