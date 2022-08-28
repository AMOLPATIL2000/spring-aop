package com.example.implmentations;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Playing the Song " + song.getTitle() + " BY " + song.getSingerName() + " With Bose Speakers";
    }
}
