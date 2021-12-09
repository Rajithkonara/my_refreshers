package state;

public class BrushTool implements Tool {

  @Override
  public void mouseDown() {
    System.out.println("Bursh icon");
  }

  @Override
  public void mouseUp() {
    System.out.println("Draw a line");
  }
}
