package pr6.builder;

public class DirectorSofa {

    public void createSofa(Builder builder){
        builder.createFrame(true);
        builder.createUpholstery(true);
        builder.createFiller(true);
    }
}
