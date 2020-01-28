package by.lazuko.project.view;

import by.lazuko.project.controller.Controller;

import java.util.Scanner;

public class View {

    private Scanner scanner;
    private String username;
    private int pin;
    private boolean result;
    private String resultMassage;
    private Controller controller;

    public View(Controller controller){
        this.controller = controller;
    }

    {
        scanner = new Scanner(System.in);
    }

    public void view(){
        try {
            System.out.print("Enter password: ");
            pin = Integer.parseInt(scanner.next());
            result = controller.checkPin(pin);
            if (result) {
                resultMassage = "Right password!";
            } else
                resultMassage = "Wrong! try again";

            System.out.println(resultMassage);
        }
        catch (Exception e){
            System.out.println("Wrong method enter! Pleas, enter numbers...");
        }



    }

}

