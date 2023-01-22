package org.example.observer;

import java.util.Observable;

public class Treasurer implements CastleDwellers {

    @Override
    public void update(Observable o, Object arg) {

        EnemyArmy enemyArmy = (EnemyArmy) arg;

        doJob(enemyArmy);

    }

    @Override
    public void doJob(EnemyArmy enemyArmy) {
        System.out.println("The treasurer is saying:");
        System.out.printf("Prepare tribute for %s\n", enemyArmy.getName());
    }

}
