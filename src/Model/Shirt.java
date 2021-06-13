package Model;

public class Shirt extends ClothingItem {

    private String pattern = "not set";

    public Shirt(Size size, double price) {
        super("shirt", size, 0);
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

}
