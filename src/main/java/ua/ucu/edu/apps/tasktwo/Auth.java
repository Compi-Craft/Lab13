package ua.ucu.edu.apps.tasktwo;

public class Auth extends Авторизація {
    public boolean auth(DataBase db) {
        db.recieveStaticData();
        return true;
    }
}
