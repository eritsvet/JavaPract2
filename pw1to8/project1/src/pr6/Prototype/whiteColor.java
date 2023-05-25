package pr6.Prototype;

public class whiteColor extends Color{
    public whiteColor()
    {
        this.colorName = "white";
    }

    @Override
    void addColor()
    {
        System.out.println("White color added");
    }
}