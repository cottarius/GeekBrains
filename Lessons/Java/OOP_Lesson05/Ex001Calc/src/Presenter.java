public class Presenter {
    View view;
    Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }
    public void buttonClick(){
        int a = view.GetValue("a: ");
        int b = view.GetValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum: ");
    }
}
