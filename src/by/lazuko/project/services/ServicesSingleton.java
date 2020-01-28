package by.lazuko.project.services;

import by.lazuko.project.services.impl.UserServicesImpl;

public class ServicesSingleton {

    private static ServicesSingleton instance = new ServicesSingleton();

    private UserServices userServices = new UserServicesImpl();

    private ServicesSingleton(){}

    public static ServicesSingleton getInstance(){

        return instance;
    }

    public UserServices getUserServices(){
        return userServices;
    }
}
