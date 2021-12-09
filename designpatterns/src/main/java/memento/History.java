package memento;

import java.util.ArrayList;
import java.util.List;

public class History {

  private List<EditorState> editorStateList = new ArrayList<>();

  public void push(EditorState state) {
    editorStateList.add(state);
  }

  public EditorState pop() {
    int lastIndex = editorStateList.size() - 1;
    EditorState lastState = editorStateList.get(lastIndex);
    editorStateList.remove(lastState);

    return lastState;
  }

}
