package org.example.abstrFactrory;

public interface AbstractFrankensteinFactory {

    LegsService getLegs();

    ArmsService getArms();

    BodyService getBody();

    HeadService getHead();

}
