/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016afunwithobserverpattern;

import java.util.ArrayList;
import java.util.List;

public class GameMap extends RobotObservable {

    private final List<Robot> robots;

    public GameMap() {
        this.robots = new ArrayList<>();
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
        super.attachObserver(robot);
    }

    public void killRobot(Robot robot) {
        robots.remove(robot);
        observers.remove(robot);
        robot.talk("Help me I just died!");
        notifyObservers();

    }

    @Override
    public void notifyObservers() {
        observers.forEach((observer) -> {
            observer.update();
        });
    }

}
