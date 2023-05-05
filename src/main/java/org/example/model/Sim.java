package org.example.model;

import lombok.Data;

@Data
public class Sim {

    String msisdn;
    String imsi;

    public Sim(String msisdn, String imsi){
        this.msisdn = msisdn;
        this.imsi = imsi;
    }

}
