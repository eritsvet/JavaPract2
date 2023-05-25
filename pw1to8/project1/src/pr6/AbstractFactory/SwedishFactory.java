package pr6.AbstractFactory;

public class SwedishFactory implements AbstractFurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new SwedishSofa();
    }

    @Override
    public Bed createBed() {
        return new SwedishBed();
    }
}