package flyweight;

public class Circle implements Shape {

    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Circle() {
        this.label = "Circle";
    }



    @Override
    public void draw(int radius, String fillColor, String lineColor) {
        System.out.println("Drawing a "+ label+ " with radius " + radius + " fill color "+ fillColor+ " line color" +lineColor);
    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {

    }
}
