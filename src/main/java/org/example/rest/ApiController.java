package org.example.rest;

import org.example.model.Sim;
import org.example.simulator.SimServiceSimulator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class ApiController {

    String baseUrl = "http://localhost:8080/simulator";

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("sims")
    public List<Sim> retrieveSimCards(){
        return restTemplate.getForObject(baseUrl + "/getSimCards", List.class);
    }

    @GetMapping("deleteAllSims")
    public void deleteSims(){

    }
}
