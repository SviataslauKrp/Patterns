package org.example.abstrFactrory;

public class Frankenstein {

    public static Monster createMonster(AbstractFrankensteinFactory aff) {

        LegsService legsService = aff.getLegs();
        Legs legs = legsService.knitLegs();

        BodyService bodyService = aff.getBody();
        Body body = bodyService.knitBody();

        ArmsService armsService = aff.getArms();
        Arms arms = armsService.knitArms();

        HeadService headService = aff.getHead();
        Head head = headService.knitHead();

        return Monster.MonsterBuilder
                .builder()
                .withArms(arms)
                .withBody(body)
                .withHead(head)
                .withLegs(legs)
                .build();

    }

}
