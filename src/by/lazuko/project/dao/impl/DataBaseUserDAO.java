package by.lazuko.project.dao.impl;

import by.lazuko.project.beans.User;
import by.lazuko.project.dao.DAOExeption.DAOExeption;
import by.lazuko.project.dao.Registration;
import java.io.*;


public class DataBaseUserDAO implements Registration {

    BufferedReader br = null;

    @Override
    public void singIn(String login, String password) throws DAOExeption {
        try{
            PrintWriter pw = new PrintWriter("User.txt");
            pw.println(login + " " + password);

        }
        catch (IOException e ){
            System.out.println("Error is: " + e);
        }
    }

    @Override
    public void userRegistration(User user) throws DAOExeption {

    }
}
