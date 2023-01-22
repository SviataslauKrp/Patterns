package org.example.abstrFactrory;

public class AbstractChineseFrankensteinFactoryImpl implements AbstractFrankensteinFactory {

    @Override
    public LegsService getLegs() {
        return new ChineseLegsServiceImpl();
    }

    @Override
    public ArmsService getArms() {
        return new ChineseArmsServiceImpl();
    }

    @Override
    public BodyService getBody() {
        return new BodyServiceImpl();
    }

    @Override
    public HeadService getHead() {
        return new ChineseHeadServiceImpl();
    }
}
