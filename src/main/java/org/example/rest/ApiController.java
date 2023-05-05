package org.example.rest;

import org.example.model.Sim;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RequestMapping("/api/")
@RestController
public class ApiController {

    String baseUrl = "http://localhost:8080/simulator";

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("sims")
    public List<Sim> retrieveSimCards() throws Exception {
        Sim[] simObjects = restTemplate.getForObject(baseUrl + "/sims", Sim[].class);
        List<Sim> sims = Arrays.asList(simObjects);
        if(sims.get(0).equals(sims.get(1))){
            return Arrays.asList(sims.get(0));
        }
        return sims;
    }

    @GetMapping("deleteAllSims")
    public void deleteSims(@RequestParam("user") String user) throws Exception{
        restTemplate.delete(baseUrl);
    }
}
