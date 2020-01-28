package by.lazuko.project.services;

import by.lazuko.project.beans.User;
import by.lazuko.project.services.servicesException.ServicesException;

public interface UserServices {
    void singIn(String login, String password) throws ServicesException;
    void registration(User user) throws ServicesException;
}
