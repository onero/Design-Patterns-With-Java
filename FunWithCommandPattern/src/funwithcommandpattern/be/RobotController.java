/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcommandpattern.be;

public class RobotController {

    private IRobotCommand mRobotCommand;

    public RobotController(IRobotCommand robotCommand) {
        mRobotCommand = robotCommand;
    }

    public void executeCommand() {
        mRobotCommand.execute();
    }

    public IRobotCommand getmRobotCommand() {
        return mRobotCommand;
    }

    public void setmRobotCommand(IRobotCommand mRobotCommand) {
        this.mRobotCommand = mRobotCommand;
    }

}
