package practice;

public class SwapWithTwoVars {

  public static void main(String[] args) {

    int x = 10;
    int y = 20;

    System.out.println("Before swapping values  x = " + x + " " + "y = " + y);

    x = x - y;

    y = x + y;

    x = y - x;

    System.out.println("After swapping values  x = " + x + " " + "y = " + y);

  }

}
