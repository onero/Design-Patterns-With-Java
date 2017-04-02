/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithadapterpattern;

import funwithadapterpattern.be.IRobot;
import funwithadapterpattern.be.LegacyRobot;
import funwithadapterpattern.bll.AdapterLegacyRobot;

/**
 *
 * @author Adamino
 */
public class FunWithAdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LegacyRobot dearOldRobot = new LegacyRobot();

        IRobot terminator = new AdapterLegacyRobot(dearOldRobot, 3);

        terminator.move(1, 2, 3, 4);
        terminator.talk("I'll be back!.... To terminate", 2);

        System.exit(0);
    }

}
