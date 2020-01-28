package by.lazuko.project.dao.DAOSingleton;

import by.lazuko.project.dao.Registration;
import by.lazuko.project.dao.impl.DataBaseUserDAO;

public class DAOSingleton {

    private static DAOSingleton instence = new DAOSingleton();

    private Registration userImpl = new DataBaseUserDAO();

    private DAOSingleton(){
    }

    public static DAOSingleton getInstance(){
        return instence;
    }

    public Registration getUserImpl(){
        return  userImpl;
    }


}
