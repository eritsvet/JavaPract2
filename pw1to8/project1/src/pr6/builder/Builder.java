package pr6.builder;

public interface Builder {
    void createFrame(Boolean hasFrame);
    void createUpholstery(Boolean hasUpholstery);
    void createFiller(Boolean hasFiller);
    Sofa getResult();
}
