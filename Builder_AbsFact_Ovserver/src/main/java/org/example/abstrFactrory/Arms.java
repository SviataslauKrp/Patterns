package org.example.abstrFactrory;

import lombok.ToString;

@ToString
public class Arms {

    private String type;

    public Arms(String type) {
        this.type = type;
    }
}
