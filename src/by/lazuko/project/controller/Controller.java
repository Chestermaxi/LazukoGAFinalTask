package by.lazuko.project.controller;


import by.lazuko.project.beans.User;

public class Controller {

    private User user;

    public Controller(User user){
        this.user = user;
    }

    public boolean checkPin(int pin){
        return user.getPin() == pin;
    }

//    private static final char paramDelimeter = ' ';
//
//    public static String executeTask(String request){
//
//        String command;
//        command = request.substring(0, request.indexOf(paramDelimeter));
//        command = command.toUpperCase();
//
//        String response = null;
//
//        switch(command){
//            case "SIGN_IN":
//
//                 break;
//                default:
//                    response = "We can't handle this command";
//        }
//     return request;
//    }


}
