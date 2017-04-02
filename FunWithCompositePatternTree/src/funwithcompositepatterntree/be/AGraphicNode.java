/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcompositepatterntree.be;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;

public abstract class AGraphicNode {

    private GraphicsContext context;

    private int x, y;

    private List<AGraphicNode> nodeChildren;

    public AGraphicNode(GraphicsContext context, int x, int y) {
        nodeChildren = new ArrayList<>();
        this.context = context;
        this.x = x;
        this.y = y;
    }

    public abstract void drawNode();

    public void addChild(AGraphicNode child) {
        nodeChildren.add(child);
    }

    public GraphicsContext getContext() {
        return context;
    }

    public void setContext(GraphicsContext context) {
        this.context = context;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<AGraphicNode> getNodeChildren() {
        return nodeChildren;
    }

    public void setNodeChildren(List<AGraphicNode> nodeChildren) {
        this.nodeChildren = nodeChildren;
    }

}
