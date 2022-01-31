package kz.aitujava;

// Concrete creator SeaLogistics overrides the factory(Logistics) method to change the
// resulting product's type to 'Sea'.
public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
