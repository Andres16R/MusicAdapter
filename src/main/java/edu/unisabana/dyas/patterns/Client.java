package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayer;
import edu.unisabana.dyas.patterns.utils.AudioPlayerAdapter;


// Cliente que utiliza directamente AdvancedAudioPlayer sin conocer la interfaz AudioPlayer
public class Client {

        public static void main(String[] args) {

            AudioPlayer audioPlayer = new AudioPlayerAdapter(new AdvancedAudioPlayer());
            audioPlayer.play( "Mp4","video.mp4");
            audioPlayer.stop();
    }
}