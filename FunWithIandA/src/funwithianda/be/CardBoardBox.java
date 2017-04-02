/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithianda.be;

public class CardBoardBox extends Cargo {

    private int mHeight;
    private int mWidth;
    private int mLength;

    public CardBoardBox(String name, int length, int height, int width, int weight) {
        super(name, weight);
        mHeight = height;
        mWidth = width;
        mLength = length;
    }

    /**
     * Get the value of length
     *
     * @return the value of length
     */
    public int getLength() {
        return mLength;
    }

    /**
     * Set the value of length
     *
     * @param length new value of length
     */
    public void setLength(int length) {
        this.mLength = length;
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public int getWidth() {
        return mWidth;
    }

    /**
     * Set the value of width
     *
     * @param width new value of width
     */
    public void setWidth(int width) {
        this.mWidth = width;
    }

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public int getHeight() {
        return mHeight;
    }

    /**
     * Set the value of height
     *
     * @param height new value of height
     */
    public void setHeight(int height) {
        this.mHeight = height;
    }

    /**
     *
     * @return space = height * lenght* width
     */
    @Override
    public int getSpace() {
        return mHeight * mLength * mWidth;
    }

    /**
     *
     * @return space
     */
    @Override
    public int getWeight() {
        return super.getmWeight();
    }

}
