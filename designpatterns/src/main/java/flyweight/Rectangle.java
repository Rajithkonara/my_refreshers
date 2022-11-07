package flyweight;

public class Rectangle implements Shape {

    private String label;


    public Rectangle() {
        this.label = "Rectangle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    @Override
    public void draw(int radius, String fillColor, String lineColor) {

    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a " + label + " with length " + length + " breadth " + breadth + " fill style " + fillStyle);

    }
}
