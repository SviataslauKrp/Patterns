package org.example.abstrFactrory;

public class AbstractColorfulFrankensteinFactoryImpl implements AbstractFrankensteinFactory {
    @Override
    public LegsService getLegs() {
        return new ChineseLegsServiceImpl();
    }

    @Override
    public ArmsService getArms() {
        return new BlackArmsServiceImpl();
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
