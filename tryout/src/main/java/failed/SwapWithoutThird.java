package failed;

public class SwapWithoutThird {

  public static void main(String[] args) {

    int x = 10;
    int y = 20;

    x = x + y;   //30

    y = x - y;   // 10

    x = x - y;

    System.out.println(x + "   " + y);
  }
}
