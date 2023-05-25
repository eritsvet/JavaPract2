package pr6.AbstractFactory;

public class SwedishBed implements Bed{
    @Override
    public void sleep() {
        System.out.println("Swedish bed");
    }
}