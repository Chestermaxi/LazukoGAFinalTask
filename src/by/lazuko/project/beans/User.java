package by.lazuko.project.beans;


public class User implements BeansInterface{

    private String pin;
    private String username;


    public User(){ }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public void singIn(String username, String pin) {
        this.username = username;
        this.pin = pin;
    }
}
