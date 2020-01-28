package by.lazuko.project.controller;

import by.lazuko.project.beans.User;
import by.lazuko.project.view.View;

public class Runner {

    public static void main(String[] args) {
        User user = new User();
        Controller controller = new Controller(user);
        View view = new View(controller);

        view.view();

    }
}
