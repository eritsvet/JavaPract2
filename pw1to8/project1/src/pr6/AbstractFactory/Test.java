package pr6.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFurnitureFactory factory1 = new SwedishFactory();
        Sofa sofa = factory1.createSofa();
        sofa.sit();
        AbstractFurnitureFactory factory2 = new GermanFactory();
        Bed bed = factory2.createBed();
        bed.sleep();
    }
}