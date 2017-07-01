@file:JvmName("Gwen")
package com.badlogicgames.gwen

import ai.kitt.snowboy.SnowboyDetect

fun main(args: Array<String>) {
    System.loadLibrary("snowboy-detect-java");

    val detector = SnowboyDetect("models/snowboy/common.res", "models/snowboy/OK Google.pmdl");
    val recorder = AudioRecorder(16000f);

    while (true) {
        val data = recorder.read();
        val result = detector.RunDetection(data, data.size);
        if (result > 0) {
            println("Hotword ${result} detected!");
        }
    }
}
