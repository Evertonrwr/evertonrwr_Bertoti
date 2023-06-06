// View.java
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class View implements Observer {
    private Model model;

    public View(Model model) {
        this.model = model;
        model.addObserver(this);
    }

    public void displayTextLines() {
        List<String> textLines = model.getTextLines();
        System.out.println("Text Lines:");
        for (String line : textLines) {
            System.out.println(line);
        }
        System.out.println();
    }

    @Override
    public void update(Observable o, Object arg) {
        displayTextLines();
    }
}
