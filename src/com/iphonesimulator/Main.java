package com.iphonesimulator;

import com.iphonesimulator.core.Device;
import com.iphonesimulator.core.System;
import com.iphonesimulator.apps.Music.MusicApp;

public class Main {
    public static void main(String[] args) {

        System.out.println("iPhoneSimulator Starting...");

        Device device = new Device();
        device.start();
        
        MusicApp music = new MusicApp();
        music.play();
    }
}

