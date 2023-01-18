package org.example.abstrFactrory;

public class AbstractBlackFrankensteinFactoryImpl implements AbstractFrankensteinFactory {

    @Override
    public LegsService getLegs() {
        return new BlackLegsServiceImpl();
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
        return new BlackHeadServiceImpl();
    }

}
