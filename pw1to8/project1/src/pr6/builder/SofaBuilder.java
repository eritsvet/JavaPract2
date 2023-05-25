package pr6.builder;

public class SofaBuilder implements Builder{

    Sofa sofa = new Sofa();

    @Override
    public void createFrame(Boolean hasFrame) {
        sofa.setHasFrame(hasFrame);
    }

    @Override
    public void createUpholstery(Boolean hasUpholstery) {
        sofa.setHasUpholstery(hasUpholstery);
    }

    @Override
    public void createFiller(Boolean hasFiller) {
        sofa.setHasFiller(hasFiller);
    }

    @Override
    public Sofa getResult() {
        return sofa;
    }
}
