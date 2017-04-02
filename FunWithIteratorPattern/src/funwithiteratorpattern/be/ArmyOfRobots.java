/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithiteratorpattern.be;

import funwithiteratorpattern.bll.Container;
import funwithiteratorpattern.bll.Iterator;

public class ArmyOfRobots implements Container {

    private final IRobot[] robots;

    public ArmyOfRobots() {
        this.robots = new IRobot[]{new ModernRobot(),
            new ModernRobot(),
            new ModernRobot(),
            new ModernRobot(),
            new ModernRobot()};
    }

    @Override
    public Iterator getIterator() {
        return new RobotIteratorCollection();
    }

    private class RobotIteratorCollection implements Iterator {

        int i = 0;

        @Override
        public boolean hasNext() {
            return i < robots.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? robots[i++] : null;
        }

    }

}
