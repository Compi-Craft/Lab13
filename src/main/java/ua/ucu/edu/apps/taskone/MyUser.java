package ua.ucu.edu.apps.taskone;

import java.time.LocalDateTime;

public interface MyUser {
    String getEmail();
    String getCountry();
    LocalDateTime getLastActiveTime();
}
