/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcommandpattern;

import static funwithcommandpattern.be.Direction.UP;
import funwithcommandpattern.be.MoveCommand;
import funwithcommandpattern.be.Robot;
import funwithcommandpattern.be.RobotController;
import static funwithcommandpattern.be.RobotVoiceType.*;
import funwithcommandpattern.be.TalkCommand;
import java.awt.Point;

/**
 *
 * @author Adamino
 */
public class FunWithCommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot rasmus = new Robot(new Point(0, 0), RASMUS);
        Robot adamino = new Robot(new Point(10, 5), ADAMINO);

        MoveCommand mc = new MoveCommand(rasmus, 2, UP);

//        mc.execute();
        TalkCommand tc = new TalkCommand(adamino, "I'm retarded", RASMUS);

        tc.execute();

        RobotController rc = new RobotController(mc);

        rc.executeCommand();

    }

}
