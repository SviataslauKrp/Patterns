package org.example.observer;

public interface EnemyArmy {

    String getName();

    default void introducing() {
        System.out.printf("We are angry and terrifying %s\n", getName());
    }

}
