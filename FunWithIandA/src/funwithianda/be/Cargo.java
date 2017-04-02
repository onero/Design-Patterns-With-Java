/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithianda.be;

public abstract class Cargo implements ITruckLoadable {

    private final String mName;

    private final int mWeight;

    public Cargo(String mName, int mWeight) {
        this.mName = mName;
        this.mWeight = mWeight;
    }

    public String getmName() {
        return mName;
    }

    public int getmWeight() {
        return mWeight;
    }

}
