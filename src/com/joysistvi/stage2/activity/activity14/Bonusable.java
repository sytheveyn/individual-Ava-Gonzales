package com.joysistvi.stage2.activity14;

/*
Bonusable represents the ability to receive a bonus.

Only classes that implement Bonusable
must provide these two methods.
*/
public interface Bonusable {

    double computeBonus();

    boolean isEligibleForBonus();
}