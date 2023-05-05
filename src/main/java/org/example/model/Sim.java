package org.example.model;

import lombok.Data;

@Data
public class Sim {

    String phoneNumber;
    String imsi;

    public Sim(String phoneNumber, String imsi){
        this.phoneNumber = phoneNumber;
        this.imsi = imsi;
    }

}
