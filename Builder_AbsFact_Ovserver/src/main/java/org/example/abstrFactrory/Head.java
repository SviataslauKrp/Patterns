package org.example.abstrFactrory;

import lombok.ToString;

@ToString
public class Head {

    private String type;

    public Head(String type) {
        this.type = type;
    }

}
