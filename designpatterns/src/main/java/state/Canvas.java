package state;

//state
public class Canvas {

  private Tool currentTool;

  public Tool getCurrentTool() {
    return currentTool;
  }

  public void setCurrentTool(Tool currentTool) {
    this.currentTool = currentTool;
  }

  public void mouseDown() {
    currentTool.mouseDown();
  }

  public void mouseUp() {
    currentTool.mouseUp();
  }

// ugly code bulk if else statements
//  public void mouseDown() {
//    if (currentTool == ToolType.SELECTION) {
//      System.out.println("Selection icon");
//    } else if (currentTool == ToolType.BRUSH) {
//      System.out.println("Brush icon");
//    } else if (currentTool == ToolType.ERASER) {
//      System.out.println("Eraser icon");
//    }
//  }
//
//  public void mouseUp() {
//    if (currentTool == ToolType.SELECTION) {
//      System.out.println("Draw dashed rect");
//    } else if (currentTool == ToolType.BRUSH) {
//      System.out.println("Draw a line ");
//    } else if (currentTool == ToolType.ERASER) {
//      System.out.println("Erase something");
//    }
//  }

}
