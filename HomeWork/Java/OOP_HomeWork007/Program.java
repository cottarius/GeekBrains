import controller.Controller;
import view.View;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.buttonClick();
    }
}
