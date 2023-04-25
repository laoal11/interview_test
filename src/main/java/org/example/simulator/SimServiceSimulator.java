package org.example.simulator;

import org.example.model.Sim;

import java.util.Arrays;
import java.util.List;

public class SimServiceSimulator {

    List<Sim> getForObject(String url, Class<?> responseType) throws Exception {
        return Arrays.asList(new Sim("491512364", "262019876542210"), new Sim("491512365","262019876543210")); //mock list, could differ
    }
}
