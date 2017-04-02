/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016afunwithobserverpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class RobotObservable {//Subject

    protected List<RobotObserver> observers;

    public RobotObservable() {
        observers = new ArrayList<>();
    }

    public void attachObserver(RobotObserver newObserver) {
        observers.add(newObserver);
    }

    public void detachObserver(RobotObserver observerToDetach) {
        observers.remove(observerToDetach);
    }

    public abstract void notifyObservers();

}
