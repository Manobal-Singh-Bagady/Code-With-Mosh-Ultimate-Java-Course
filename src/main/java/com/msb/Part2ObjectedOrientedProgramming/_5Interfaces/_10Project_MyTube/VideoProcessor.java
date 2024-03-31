package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._10Project_MyTube;

import org.jetbrains.annotations.NotNull;

public class VideoProcessor {
    private final VideoEncoder videoEncoder;
    private final VideoDatabase videoDatabase;
    private final NotificationService notificationService;

    public VideoProcessor(
            @NotNull VideoEncoder videoEncoder,
            @NotNull VideoDatabase videoDatabase,
            @NotNull NotificationService notificationService
    ) {
        this.videoEncoder = videoEncoder;
        this.videoDatabase = videoDatabase;
        this.notificationService = notificationService;
    }

    public void process(@NotNull Video video) {
        this.videoEncoder.encode(video);
        this.videoDatabase.store(video);
        this.notificationService.sendNotification(video.user());
    }
}

