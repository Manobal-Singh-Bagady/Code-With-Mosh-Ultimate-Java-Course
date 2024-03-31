package com.msb.Part2ObjectedOrientedProgramming._5Interfaces._10Project_MyTube;

import org.jetbrains.annotations.NotNull;

public class AVideoEncoder implements VideoEncoder {
    @Override
    public void encode(@NotNull Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
