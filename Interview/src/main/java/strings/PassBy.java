package strings;

public class PassBy {

    private static void change(Obj x) {
        x.setX(10);
    }

    public static void main(String[] args) {
        Obj obj = new Obj();
        change(obj);
        obj.setX(40);

        System.out.println(obj.getX());
    }

}

class Obj {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x;

    @Override
    public String toString() {
        return super.toString();
    }
}
