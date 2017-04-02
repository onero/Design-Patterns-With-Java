/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithiteratorpattern;

import funwithiteratorpattern.be.ArmyOfRobots;
import funwithiteratorpattern.be.IRobot;
import funwithiteratorpattern.bll.Iterator;

/**
 *
 * @author Adamino
 */
public class FunWithIteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArmyOfRobots army = new ArmyOfRobots();

//        for (Iterator<IRobot> iter = army.getIterator(); iter.hasNext();) {
//            IRobot robot = iter.next();
//            robot.talk("I'm robot", 1);
//        }
        Iterator<IRobot> iter = army.getIterator();
        while (iter.hasNext()) {
            IRobot robot = iter.next();
            robot.talk("I'm robot", 1);
        }
    }

}
