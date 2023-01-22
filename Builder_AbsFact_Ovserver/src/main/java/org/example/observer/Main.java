package org.example.observer;

public class Main {

    public static void main(String[] args) {

        Battlefield battlefield = new Battlefield();

        EnemyArmy galls = new Galls();
        EnemyArmy barbarians = new Barbarians();

        CastleDwellers king = new King();
        CastleDwellers treasurer = new Treasurer();
        CastleDwellers general = new General();

        battlefield.addObserver(king);
        battlefield.addObserver(treasurer);
        battlefield.addObserver(general);

        battlefield.somethingHappened(galls);
        System.out.println("====================================");
        battlefield.somethingHappened(barbarians);

    }

}
