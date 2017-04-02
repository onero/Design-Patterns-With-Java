/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithadapterpattern.bll;

import funwithadapterpattern.be.IRobot;
import funwithadapterpattern.be.LegacyRobot;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdapterLegacyRobot implements IRobot {

    private final LegacyRobot oldSheit;

    public AdapterLegacyRobot(LegacyRobot oldRobot, int speed) {
        oldSheit = oldRobot;
        oldSheit.speed = speed;
    }

    @Override
    public void move(int x0, int y0, int x1, int y1) {
        int oneDirection;

        if (y0 == y1) {
            oneDirection = x0 < x1 ? 1 : 2;
        } else {
            oneDirection = y0 < y1 ? 3 : 4;
        }
        oldSheit.direction = oneDirection;
        oldSheit.move(oldSheit.speed);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(AdapterLegacyRobot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void talk(String thingsToSay, int voiceType) {
        String voiceTypeAsString = "";
        switch (voiceType) {
            case 1:
                voiceTypeAsString = "****RASMUS****";
                break;
            case 2:
                voiceTypeAsString = "****ADAM****";
                break;
            default:
                System.out.println("Sheit");
        }
        oldSheit.speakBuffer = (voiceTypeAsString + thingsToSay).toCharArray();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(AdapterLegacyRobot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
