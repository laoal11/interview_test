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

    @Override
    public boolean equals(Object obj){
        Sim sim2 = (Sim) obj;
        if(this.msisdn.equals(sim2.msisdn)){
            if(this.imsi.equals(sim2.msisdn)){
                return true;
            }
        }
        return false;
    }

}
