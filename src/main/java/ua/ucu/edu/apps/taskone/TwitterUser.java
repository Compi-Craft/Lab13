package ua.ucu.edu.apps.taskone;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data @ToString
public class TwitterUser {
    private String userMail;
    private String country;
    private LocalDateTime lastActiveTime;
}
