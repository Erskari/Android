enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE,
        MAGENTA
    };

public class Note {
    protected String content;
    protected Color backgroundColor;
    public Note() {
        content = "";
        backgroundColor = Color.RED;
    }

    public Note(String content, Color backgroundColor) {
        this.content = content;
        this.backgroundColor = backgroundColor;
    }
    // Getter
    public String getContent() {
        return content;
    }
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    // Setter
    public void setContent(String content) {
        this.content = content;
    }
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String toString() {
        return "Content: " + content + " Background color: " + backgroundColor;
     }
}
