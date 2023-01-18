package org.example.abstrFactrory;

public class ChineseArmsServiceImpl implements ArmsService {
    @Override
    public Arms knitArms() {
        return new Arms("chinese arms");
    }
}
