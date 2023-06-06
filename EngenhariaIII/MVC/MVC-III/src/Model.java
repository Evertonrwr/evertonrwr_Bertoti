// Model.java
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable {
    private List<String> textLines;

    private static Model instance;

    private Model() {
        textLines = new ArrayList<>();
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    public void addTextLine(String line) {
        textLines.add(line);
        setChanged();
        notifyObservers();
    }

    public List<String> getTextLines() {
        return textLines;
    }
}
