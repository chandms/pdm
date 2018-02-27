package com.disarm.surakshit.pdm.DBEntities;

import io.objectbox.annotation.Id;

/**
 * Created by naman on 27/2/18.
 */

public class Receiver {
    @Id
    long id;
    String number;
    String kml;

    public Receiver(){

    }
    public Receiver(String number,String kml){
        this.number = number;
        this.kml = kml;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getKml() {
        return kml;
    }

    public void setKml(String kml) {
        this.kml = kml;
    }
}
