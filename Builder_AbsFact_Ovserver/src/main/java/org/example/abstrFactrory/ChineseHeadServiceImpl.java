package org.example.abstrFactrory;

public class ChineseHeadServiceImpl implements HeadService {
    @Override
    public Head knitHead() {
        return new Head("chinese head");
    }
}
