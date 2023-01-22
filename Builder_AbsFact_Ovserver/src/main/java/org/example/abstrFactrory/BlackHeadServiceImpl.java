package org.example.abstrFactrory;

public class BlackHeadServiceImpl implements HeadService {
    @Override
    public Head knitHead() {
        return new Head("black head");
    }
}
