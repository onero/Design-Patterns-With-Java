/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithianda.be;

public class Tube extends Cargo {

    private int mRadius;
    private int mLength;

    public Tube(String name, int weight, int radius, int length) {
        super(name, weight);
        mRadius = radius;
        mLength = length;
    }

    /**
     * Get the value of mLength
     *
     * @return the value of mLength
     */
    public int getmLength() {
        return mLength;
    }

    /**
     * Set the value of mLength
     *
     * @param mLength new value of mLength
     */
    public void setmLength(int mLength) {
        this.mLength = mLength;
    }

    /**
     * Get the value of mRadius
     *
     * @return the value of mRadius
     */
    public int getmRadius() {
        return mRadius;
    }

    /**
     * Set the value of mRadius
     *
     * @param mRadius new value of mRadius
     */
    public void setmRadius(int mRadius) {
        this.mRadius = mRadius;
    }

    @Override
    public int getWeight() {
        return super.getmWeight();
    }

    /**
     *
     * @return space of tube
     */
    @Override
    public int getSpace() {
        return (int) (2 * Math.PI * mRadius * mLength);
    }

}
