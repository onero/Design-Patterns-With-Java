/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithiteratorpattern.be;

public class ModernRobot implements IRobot {

    @Override
    public void move(int x0, int y0, int x1, int y1) {
        System.out.println("Moving from " + x0 + ","
                + y0 + " to " + x1 + "," + y1);
    }

    @Override
    public void talk(String thingsToSay, int voiceType) {
        System.out.println(this.hashCode() + " is Saying: " + thingsToSay);
    }

}
