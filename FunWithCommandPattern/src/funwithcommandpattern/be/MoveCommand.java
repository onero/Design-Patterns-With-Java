/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcommandpattern.be;

public class MoveCommand implements IRobotCommand {

    private final Robot mCurrentRobot;

    private final int mCurrentDistance;

    private final Direction mCurrentDirection;

    public MoveCommand(Robot robot, int distance, Direction direction) {
        mCurrentDirection = direction;
        mCurrentDistance = distance;
        mCurrentRobot = robot;
    }

    @Override
    public void execute() {
        mCurrentRobot.move(mCurrentDirection, mCurrentDistance);

    }

}
