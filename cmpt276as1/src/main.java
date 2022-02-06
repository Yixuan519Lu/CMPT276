import Model.Manager;
import UI.myUI;

public class main {
    public static void main(String args[]) {
        Manager l_manager = new Manager();
        myUI hey = new myUI(l_manager);
        hey.show();
    }
}