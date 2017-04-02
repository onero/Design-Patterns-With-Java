/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithadapterpattern.be;

import java.util.Timer;
import java.util.TimerTask;

public class LegacyRobot {

    // Yes they are all public, and they didn't care
    public int speed;
    public int direction;
    public char[] speakBuffer;

    private Timer timer;

    public LegacyRobot() {
        speakBuffer = new char[0];
        timer = new Timer();
        timer.schedule(new TalkTimer(this), 1000); // timer looks every one second if there is something in buffer
    }

    public void jump(int howHigh) {
        System.out.println("I'm jumping: " + howHigh);

    }

    public void stopMoving() {
        speed = 0;
    }

    public void move(int speed) {
        this.speed = speed;
        System.out.println("Moving speed " + speed + " direction " + direction);
    }

    protected void talkViewer() {
        if (speakBuffer.length > 0) {
            System.out.println("Saying: " + new String(speakBuffer));
            speakBuffer = new char[0];
        }
    }

    private class TalkTimer extends TimerTask {

        private LegacyRobot roboto;

        public TalkTimer(LegacyRobot roboto) {
            this.roboto = roboto;
        }

        @Override
        public void run() {
            roboto.talkViewer();
        }

    }

}
