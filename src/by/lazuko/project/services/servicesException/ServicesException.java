package by.lazuko.project.services.servicesException;

public class ServicesException extends Exception {

    public static final long serialVersionUID = 1L;

    public ServicesException(){

    }

    public ServicesException(String massage){
        super(massage);
    }

    public ServicesException(Exception e){
        super(e);
    }

    public ServicesException(String massage, Exception e){
        super(massage, e);
    }

}
