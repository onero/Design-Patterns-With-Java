/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016afunwithobserverpattern;

import java.awt.Point;

/**
 *
 * @author Adamino
 */
public class CS2016AFunWithObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameMap gameArea = new GameMap();

        Robot adam = new Robot(new Point(10, 10), RobotVoiceType.BOB);
        Robot rasmus = new Robot(new Point(20, 20), RobotVoiceType.RYAN);
        Robot peter = new Robot(new Point(30, 20), RobotVoiceType.PETER);

        gameArea.addRobot(adam);
        gameArea.addRobot(rasmus);
        gameArea.addRobot(peter);

        gameArea.killRobot(rasmus);
    }

}
