import menu.Menu;
import model.Model;
import presenter.Presenter;
import view.View;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new Presenter(new View(), new Model(), new Menu());
        presenter.buttonClick();

    }
}