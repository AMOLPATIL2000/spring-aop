package com.example.implmentations;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Playing the Song " + song.getTitle() + " BY " + song.getSingerName() + " With Sony Speakers";
    }
}
