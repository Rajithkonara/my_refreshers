package state;

public class Main {

  public static void main(String[] args) {
    drawUiControl(new TextBox());
  }

  private static void drawUiControl(UIControl uiControl) {
    uiControl.draw();
  }

}
