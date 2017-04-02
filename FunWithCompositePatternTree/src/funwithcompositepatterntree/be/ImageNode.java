/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcompositepatterntree.be;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ImageNode extends AGraphicNode {

    private final Image img;

    public ImageNode(Image img, GraphicsContext context, int x, int y) {
        super(context, x, y);
        this.img = img;
    }

    /**
     * Draw the ImageNode
     */
    @Override
    public void drawNode() {
        super.getContext().drawImage(img, super.getX(), super.getY());
        for (AGraphicNode aGraphicNode : super.getNodeChildren()) {
            aGraphicNode.drawNode();
        }
    }

}
