package _31_Interface._03_RapMusic;

import _31_Interface._00_Playing.IMusic;
import _31_Interface._00_Playing.MusicDriving;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RapMusic extends MusicDriving implements IMusic {
    @Override
    public void Cal() throws UnsupportedAudioFileException, LineUnavailableException, IOException {

        List<String> dosyaYollari = new ArrayList<>();

        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_16\\_03_RapMusic\\1 Suspus.wav");
        dosyaYollari.add("C:\\Users\\muhammed.mavus1\\IdeaProjects\\Practices_Lesson_B5\\src\\Gun_16\\_03_RapMusic\\2 Toz Taneleri.wav");

        rastgeleMusicCal(dosyaYollari);



    }
}
