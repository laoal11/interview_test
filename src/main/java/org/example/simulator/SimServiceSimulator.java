package org.example.simulator;

import org.example.model.Sim;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RequestMapping("simulator")
@RestController
public class SimServiceSimulator {

    @GetMapping("/sims")
    List<Sim> getForObject(String url, Class<?> responseType) throws Exception {
        Random random = new Random();
        int num = random.nextInt(3 - 1 + 1) + 1;
        switch (num){
            case 1:
                return Arrays.asList(new Sim("491512364", "262019876542210"));
            case 2:
                return Arrays.asList(new Sim("491512364", "262019876542210"), new Sim("491512364","262019876542210"));
            default:
                return Arrays.asList(new Sim("491512", "262019876542245"), new Sim("491512365","262019876543210"), new Sim("491512365","262019876543210"),new Sim("491512", "262019876542245"));
        }
    }
}
