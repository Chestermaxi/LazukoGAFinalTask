package by.lazuko.project.services.impl;

import by.lazuko.project.beans.User;
import by.lazuko.project.dao.DAOExeption.DAOExeption;
import by.lazuko.project.dao.DAOSingleton.DAOSingleton;
import by.lazuko.project.dao.Registration;
import by.lazuko.project.services.UserServices;
import by.lazuko.project.services.servicesException.ServicesException;

public class UserServicesImpl implements UserServices {
    @Override
    public void singIn(String login, String password) throws ServicesException {
        if(login == null || login.isEmpty()){
            throw new ServicesException("Incorrect login");
        }
        if(password == null || password.isEmpty()){
            throw new ServicesException("Incorrect password");
        }
        try {
            DAOSingleton singUser = DAOSingleton.getInstance();
            Registration registration = singUser.getUserImpl();
            registration.singIn(login,password);
        }
        catch (DAOExeption e){
            throw new ServicesException("Mistake of creating new user");
        }
    }

    @Override
    public void registration(User user) throws ServicesException {

    }
}
