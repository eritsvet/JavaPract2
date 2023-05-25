package pr6.builder;

public class TestBuilder {
    public static void main(String[] args) {
        DirectorSofa sofa = new DirectorSofa();
        SofaBuilder builder = new SofaBuilder();
        sofa.createSofa(builder);
        System.out.println(builder.getResult());
    }
}