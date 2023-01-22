package org.example.observer;

import java.util.Observable;

public class General implements CastleDwellers {

    @Override
    public void update(Observable o, Object arg) {

        EnemyArmy enemyArmy = (EnemyArmy) arg;

        doJob(enemyArmy);

    }

    @Override
    public void doJob(EnemyArmy enemyArmy) {
        System.out.println("The general is saying:");
        System.out.printf("Prepare the army for %s\n", enemyArmy.getName());
    }

}
