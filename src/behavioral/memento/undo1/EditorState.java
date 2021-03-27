package behavioral.memento.undo1;

public class EditorState {
    //cannot be changed
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
