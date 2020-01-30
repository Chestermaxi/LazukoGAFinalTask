package by.lazuko.project.view;

import by.lazuko.project.controller.Controller;

import static by.lazuko.project.view.ScannerInfo.*;

public class View {

    private String request;
    private Controller controller;

    public View(Controller controller){
        this.controller = controller;
    }

    public void view(){
        try {
            System.out.println("1) Sing in");
            request = retString();
            controller.getInfo(request);
        }
        catch (Exception e){
            System.out.println("Wrong method enter! Pleas, enter numbers...");
        }



    }

}

