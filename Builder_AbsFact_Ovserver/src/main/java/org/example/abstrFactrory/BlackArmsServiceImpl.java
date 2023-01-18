package org.example.abstrFactrory;

public class BlackArmsServiceImpl implements ArmsService {
    @Override
    public Arms knitArms() {
        return new Arms("black arms");
    }
}
