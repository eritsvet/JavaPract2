package pr6.AbstractFactory;

public class GermanFactory implements AbstractFurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new GermanSofa();
    }

    @Override
    public Bed createBed(){
        return new GermanBed();
    }
}