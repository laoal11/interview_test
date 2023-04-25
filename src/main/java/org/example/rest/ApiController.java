package org.example.rest;

import org.example.model.Sim;
import org.example.simulator.SimServiceSimulator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/")
@RestController
public class ApiController {

    //pretend this is a RestTemplate
    SimServiceSimulator simServiceRestTemplate = new SimServiceSimulator();

    @GetMapping("sims")
    public Sim retrieveSimCards(){
        return new Sim("Testvalue", "TestValue");
    }

    @GetMapping("deleteAllSims")
    public void deleteSims(){

    }
}
