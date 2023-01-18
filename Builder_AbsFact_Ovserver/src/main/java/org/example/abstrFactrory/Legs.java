package org.example.abstrFactrory;

import lombok.ToString;

@ToString
public class Legs {

    private String type;

    public Legs(String type) {
        this.type = type;
    }

}
