package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._10Project_MyTube;

import org.jetbrains.annotations.NotNull;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification(@NotNull User user) {
        System.out.println(STR."Notifying \{user.email()}...");
        System.out.println("Done!\n");
    }
}
