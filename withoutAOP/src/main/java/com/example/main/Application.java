package com.example.main;

import com.example.config.ProjectConfig;
import com.example.implmentations.Song;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        Song song = new Song();
        song.setSingerName("Arijit Sing");
        song.setTitle("Demo");
        System.out.println(vehicleServices.playMusic(true,song));
        vehicleServices.moveVehicle(true);
        vehicleServices.applyBrake(true);
    }
}
