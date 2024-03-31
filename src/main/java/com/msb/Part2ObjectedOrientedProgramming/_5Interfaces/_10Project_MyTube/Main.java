package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._10Project_MyTube;

public class Main {
    public static void main(String[] args) {
        var video = new Video("birthday.mp4", "Jennifer's birthday", new User("john@domain.com"));
        var processor = new VideoProcessor(new AVideoEncoder(), new SQLVideoDatabase(), new EmailService());
        processor.process(video);
    }
}
