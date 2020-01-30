package by.lazuko.project.controller;


import by.lazuko.project.beans.User;
import by.lazuko.project.services.ServicesSingleton;
import by.lazuko.project.services.UserServices;
import by.lazuko.project.services.servicesException.ServicesException;

public class Controller {

    private User user;
    private UserServices userServices;

    public String getInfo(String request) throws ControllerException {

        if(request == null || request.isEmpty()){
            throw new ControllerException("Wrong enter");
        }

        String command;
        command = request;
        command = command.toUpperCase();
        String username = null;
        String password = null;
        String response = null;
        ServicesSingleton servicesSingleton = ServicesSingleton.getInstance();
        UserServices userServices = servicesSingleton.getUserServices();

        switch (command) {
            case "1":
                try {

                    userServices.singIn(username, password);
                    return "Welcome!";
                } catch (ServicesException e) {
                    System.out.println("Wrong!");
                }
                break;
            default:
                response = "We can't handle this command";
        }
        return request;
    }


}
