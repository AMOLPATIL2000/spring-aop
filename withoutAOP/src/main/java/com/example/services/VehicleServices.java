package com.example.services;

import com.example.implmentations.Song;
import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class VehicleServices {

    Logger logger = Logger.getLogger(VehicleServices.class.getName());
    @Autowired
    public Speakers speakers;
    @Autowired
    public Tyres tyres;

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public String playMusic ( boolean vehicleStarted , Song song)
    {
        Instant start = Instant.now();
        logger.info("Method Execution Starts");
        String music;
        if(vehicleStarted)
            music = speakers.makeSound(song);
        else
            logger.log(Level.SEVERE,"Vehicle Not Started to Perform the Operation");
        logger.info("Method Execution Ends");
        Instant end= Instant.now();
        long timeElapsed = Duration.between(start,end).toMillis();
        logger.info("Time took to execute the Method : " + timeElapsed);
        return  speakers.makeSound(song);
    }
    public String moveVehicle ( boolean vehicleStarted)
    {
        Instant start = Instant.now();
        logger.info("Method Execution Starts");
        String music;
        if(vehicleStarted)
            music = tyres.move();
        else
            logger.log(Level.SEVERE,"Vehicle Not Started to Perform the Operation");
        logger.info("Method Execution Ends");
        Instant end= Instant.now();
        long timeElapsed = Duration.between(start,end).toMillis();
        logger.info("Time took to execute the Method : " + timeElapsed);
        return  tyres.move();
    }
    public String applyBrake ( boolean vehicleStarted)
    {
        Instant start = Instant.now();
        logger.info("Method Execution Starts");
        String music;
        if(vehicleStarted)
            music = tyres.stop();
        else
            logger.log(Level.SEVERE,"Vehicle Not Started to Perform the Operation");
        logger.info("Method Execution Ends");
        Instant end= Instant.now();
        long timeElapsed = Duration.between(start,end).toMillis();
        logger.info("Time took to execute the Method : " + timeElapsed);
        return  tyres.stop();
    }

}
