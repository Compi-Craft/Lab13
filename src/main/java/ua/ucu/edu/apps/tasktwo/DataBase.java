package ua.ucu.edu.apps.tasktwo;

public class DataBase extends БазаДаних {
    public String recieveUserData() {
        return отриматиДаніКористувача();
    }

    public String recieveStaticData() {
        return отриматиСтатистичніДані();
    }
}
