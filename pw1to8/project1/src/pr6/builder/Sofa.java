package pr6.builder;

public class Sofa {
    private Boolean hasFrame;
    private Boolean hasUpholstery;
    private Boolean hasFiller;

    public void setHasFrame(Boolean hasFrame) {
        this.hasFrame = hasFrame;
    }

    public void setHasUpholstery(Boolean hasUpholstery) {
        this.hasUpholstery = hasUpholstery;
    }

    public void setHasFiller(Boolean hasFiller) {
        this.hasFiller = hasFiller;
    }

    public Boolean getHasFrame() {
        return hasFrame;
    }

    public Boolean getHasUpholstery() {
        return hasUpholstery;
    }

    public Boolean getHasFiller() {
        return hasFiller;
    }

    @Override
    public String toString(){
        return "Sofa: " +
                "\nframe: " + hasFrame +
                "\nupholstery: " + hasUpholstery +
                "\nfiller: " + hasFiller;
    }

}