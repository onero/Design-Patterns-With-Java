/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcompositepatterntree.be;

import javafx.scene.canvas.GraphicsContext;

public class TextNode extends AGraphicNode {

    private String str;

    public TextNode(String str, GraphicsContext context, int x, int y) {
        super(context, x, y);
        this.str = str;
    }

    /**
     * Get the value of str
     *
     * @return the value of str
     */
    public String getStr() {
        return str;
    }

    /**
     * Set the value of str
     *
     * @param str new value of str
     */
    public void setStr(String str) {
        this.str = str;
    }

    /**
     * Draw the TextNode
     */
    @Override
    public void drawNode() {
        super.getContext().fillText(str, super.getX(), super.getY());
        for (AGraphicNode aGraphicNode : super.getNodeChildren()) {
            aGraphicNode.drawNode();
        }
    }

}
