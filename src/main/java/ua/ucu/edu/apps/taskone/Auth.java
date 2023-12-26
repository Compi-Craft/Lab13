package ua.ucu.edu.apps.taskone;

public class Auth {
    public MyUser login() {
        return new MyTwitterUser(new TwitterUser());
    }
}
