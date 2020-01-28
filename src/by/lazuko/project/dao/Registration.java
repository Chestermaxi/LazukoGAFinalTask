package by.lazuko.project.dao;

import by.lazuko.project.beans.User;
import by.lazuko.project.dao.DAOExeption.DAOExeption;

public interface Registration {
    void singIn(String login, String password) throws DAOExeption;
    void userRegistration(User user) throws DAOExeption;
}
