package org.example.observer;

import java.util.Observable;

public class Battlefield extends Observable {

    public void somethingHappened(EnemyArmy enemyArmy) {

        System.out.println("An enemy army has come");
        enemyArmy.introducing();
        setChanged();
        notifyObservers(enemyArmy);

    }

}
