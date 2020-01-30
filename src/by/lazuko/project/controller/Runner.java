package by.lazuko.project.controller;
import by.lazuko.project.view.View;

public class Runner {

    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View(controller);

        view.view();

    }
}
