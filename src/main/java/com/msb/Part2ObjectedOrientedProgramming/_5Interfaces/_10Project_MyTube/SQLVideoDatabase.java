package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._10Project_MyTube;

import org.jetbrains.annotations.NotNull;

public class SQLVideoDatabase implements VideoDatabase {
    @Override
    public void store(@NotNull Video video) {
        System.out.println("Storing video metadata in a SQL database...");
        System.out.println(STR."Title: \{video.title()}");
        System.out.println(STR."File Name: \{video.filename()}");
        System.out.println("Done!\n");
    }
}
