package entities_3;

public class Comment {
    private String text;

    public Comment(String text) {
        this.text = text;
    }

    public Comment() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment [text=" + text + "]";
    }
}
