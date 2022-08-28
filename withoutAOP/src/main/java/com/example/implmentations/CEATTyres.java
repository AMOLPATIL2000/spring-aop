package com.example.implmentations;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class CEATTyres implements Tyres {

    @Override
    public String move() {
        return "Vehicle Moving with the Help of CEAT Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle Stopped with the Help of CEAT Tyres";
    }
}
