package org.example.simulator;

import org.example.model.Sim;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RequestMapping("simulator")
@RestController
public class SimServiceSimulator {

    @GetMapping("/sims")
    ResponseEntity<List<Sim>> retrieveSims(String url, Class<?> responseType) throws Exception {
        Random random = new Random();
        int num = random.nextInt(4 - 1 + 1) + 1;
        switch (num){
            case 1:
                return new ResponseEntity<>(Arrays.asList(new Sim("491512364", "262019876542210")), HttpStatus.OK);
            case 2:
                return new ResponseEntity<>(Arrays.asList(new Sim("491512364", "262019876542210"), new Sim("491512364","262019876542210")), HttpStatus.OK);
            case 3:
                return new ResponseEntity<>(Arrays.asList(new Sim("491512", "262019876542245"), new Sim("491512365","262019876543210"), new Sim("491512365","262019876543210"),new Sim("491512", "262019876542245")), HttpStatus.OK);
            default:
                return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/user/{user}")
    public void deleteAlLSims(@RequestParam("user") String user) throws Exception{
        System.out.println("USER: " + user);
    }

}
