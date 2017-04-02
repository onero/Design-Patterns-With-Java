/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithobservernews.bll;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsObservable {

    private final List<NewsObserver> observers;

    public NewsObservable() {
        observers = new ArrayList<>();
    }

    /**
     * Attach new observer
     *
     * @param o
     */
    public void attachObserver(NewsObserver o) {
        observers.add(o);
    }

    /**
     * Detach new observer
     *
     * @param o
     */
    public void detachObserver(NewsObserver o) {
        observers.remove(o);
    }

    /**
     * Notify all observers
     */
    public void notifyObservers() {
        for (NewsObserver observer : observers) {
            observer.update();
        }
    }

}
