/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcommandpattern.be;

import java.awt.Point;

public class Robot {

    private final Point mPoint;

    private final RobotVoiceType mVoiceType;

    public Robot(Point point, RobotVoiceType voiceType) {
        mPoint = point;
        mVoiceType = voiceType;
    }

    public Point getmPoint() {
        return mPoint;
    }

    public RobotVoiceType getmVoiceType() {
        return mVoiceType;
    }

    /**
     * Robot moves
     *
     * @param direction
     * @param distance
     */
    public void move(Direction direction, int distance) {
        switch (direction) {
            case UP:
                mPoint.y -= distance;
                break;
            case DOWN:
                mPoint.y += distance;
                break;
            case LEFT:
                mPoint.x -= distance;
                break;
            case RIGHT:
                mPoint.x += distance;
                break;
            default:
                System.out.println("Sheit!");
        }
        System.out.println("Moving " + distance + " in direction " + direction.name());
        System.out.println("New locaion: " + mPoint.x + ", " + mPoint.y);
    }

    /**
     * Robot says stuff!
     *
     * @param thingToSay
     * @param voiceType
     */
    public void Talk(String thingToSay, RobotVoiceType voiceType) {
        System.out.println("Robot says: " + thingToSay + " in the voice of " + voiceType);
    }

}
