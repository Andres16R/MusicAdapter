package edu.unisabana.dyas.patterns.utils;

import java.util.Objects;

public class AudioPlayerAdapter implements  AudioPlayer{

    AdvancedAudioPlayer advancedAudioPlayer;

    public AudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(Objects.equals(audioType, "Mp4")){
            advancedAudioPlayer.playMp4(fileName);
        } else if ("Vlc".equals(audioType)){
            advancedAudioPlayer.playVlc(fileName);
        } else {
            System.out.println("Error de formato");
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}
