package com.example.implmentations;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MRFTyres implements Tyres {
    @Override
    public String move() {
        return "Vehicle Moving with the Help of MRF Tyres";
    }

    @Override
    public String stop() {
        return "Vehicle Stopped with the Help of MRF Tyres";
    }
}
