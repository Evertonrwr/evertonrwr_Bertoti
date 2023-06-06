// Main.java
public class Main {
    public static void main(String[] args) {
        Model model = Model.getInstance();
        View view = new View(model);
        Controller controller = new Controller(model, view);
        controller.start();
    }
}
