package strings;

public class PassByEx {

    public static void main(String[] args) {

        int x =10;
        int y = 20;

        swapint(x, y);
        System.out.println(x + " + " +y);

        Balloon red = new Balloon("Red"); //memory reference 50
        Balloon blue = new Balloon("Blue"); //memory reference 100

        swap(red, blue);
        System.out.println("red color="+red.getColor());
        System.out.println("blue color="+blue.getColor());

        foo(blue);
        System.out.println("blue color="+blue.getColor());

    }

    private static void swap(Object object1, Object object2) {
        Object temp = object1;
        object1 = object2;
        object2 = temp;
    }

    private static void foo(Balloon balloon) { //baloon=100
        balloon.setColor("Red"); //baloon=100
        balloon = new Balloon("Green"); //baloon=200
        balloon.setColor("Blue"); //baloon = 200
    }

    static void swapint(int x, int y) {
        int temp = x;
        x = y;
        y =temp;
    }


}

class Balloon {

    private String color;

    public Balloon() {
    }

    public Balloon(String c) {
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}