package org.example.observer;

import java.util.Observable;

public class King implements CastleDwellers {

    @Override
    public void update(Observable o, Object arg) {

        EnemyArmy enemyArmy = (EnemyArmy) arg;

        doJob(enemyArmy);

    }

    @Override
    public void doJob(EnemyArmy enemyArmy) {
        System.out.println("The king is saying:");
        System.out.printf("Assemble a delegation to %s\n", enemyArmy.getName());
    }
}
