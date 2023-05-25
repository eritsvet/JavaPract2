package pr6.Prototype;

public class Prototype {
    public static void main (String[] args)
    {
        ColorStore.getColor("white").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("white").addColor();
    }
}