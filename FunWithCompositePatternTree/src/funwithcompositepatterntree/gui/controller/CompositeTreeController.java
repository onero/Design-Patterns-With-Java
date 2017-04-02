/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcompositepatterntree.gui.controller;

import funwithcompositepatterntree.be.AGraphicNode;
import funwithcompositepatterntree.be.ImageNode;
import funwithcompositepatterntree.be.TextNode;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author gta1
 */
public class CompositeTreeController implements Initializable {

    @FXML
    private Canvas myCanvas;

    private static final String DRAW_STRING = "Hej vi tegner tekst med Jeppe";
    private static final String DRAW_STRING2 = "Ses vi mon!?";
    private static final String DRAW_STRING3 = "Tell me the meaning of being lonely!";
    private final Image java = new Image("/funwithcompositepatterntree/assets/img/java.png");

    @FXML
    private void handleButtonAction() {
        GraphicsContext context = myCanvas.getGraphicsContext2D();
        AGraphicNode node = new TextNode(DRAW_STRING, context, 150, 150);
        AGraphicNode child = new TextNode(DRAW_STRING2, context, 250, 250);
        AGraphicNode imageChild = new ImageNode(java, context, 100, 100);
        node.addChild(child);
        node.addChild(imageChild);
        node.drawNode();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
