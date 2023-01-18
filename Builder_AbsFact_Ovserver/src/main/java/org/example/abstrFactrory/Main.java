package org.example.abstrFactrory;

public class Main {

    public static void main(String[] args) {

        AbstractFrankensteinFactory chinese = new AbstractChineseFrankensteinFactoryImpl();
        AbstractFrankensteinFactory black = new AbstractBlackFrankensteinFactoryImpl();
        AbstractFrankensteinFactory colorful = new AbstractColorfulFrankensteinFactoryImpl();

        Monster blackMonster = Frankenstein.createMonster(black);
        Monster chineseMonster = Frankenstein.createMonster(chinese);
        Monster colorfulMonster = Frankenstein.createMonster(colorful);

        System.out.println(blackMonster);
        System.out.println(colorfulMonster);
        System.out.println(chineseMonster);

    }

}
