/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcommandpattern.be;

public class TalkCommand implements IRobotCommand {

    private final Robot mCurrentRobot;

    private final String mCurrentString;

    private final RobotVoiceType mCurrentVoiceType;

    public TalkCommand(Robot robot, String string, RobotVoiceType robotVoiceType) {
        mCurrentRobot = robot;
        mCurrentString = string;
        mCurrentVoiceType = robotVoiceType;
    }

    public Robot getmCurrentRobot() {
        return mCurrentRobot;
    }

    public String getmCurrentString() {
        return mCurrentString;
    }

    public RobotVoiceType getmCurrentVoiceType() {
        return mCurrentVoiceType;
    }

    @Override
    public void execute() {
        mCurrentRobot.Talk(mCurrentString, mCurrentVoiceType);
    }

}
