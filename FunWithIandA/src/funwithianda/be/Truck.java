/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithianda.be;

public class Truck {

    private String mName;

    private int mAvailableStorageSpace;

    private int mAvailableStorageWeight;

    public Truck(String name, int availableStorageSpace, int availableStorageWeight) {
        mName = name;
        mAvailableStorageSpace = availableStorageSpace;
        mAvailableStorageWeight = availableStorageWeight;
    }

    /**
     * Checks if the Truck can be loaded
     *
     * @param cargo
     * @return
     */
    public boolean canLoad(ITruckLoadable cargo) {
        //Check if the box fits to the Truck

        return mAvailableStorageWeight > cargo.getWeight()
                && mAvailableStorageSpace > cargo.getSpace();
    }

    /**
     * Load the cargo
     *
     * @param cargo
     */
    public void loadCargo(ITruckLoadable cargo) {
        mAvailableStorageSpace -= cargo.getSpace();
        mAvailableStorageWeight -= cargo.getWeight();
        System.out.println("Loaded " + cargo.getClass().getSimpleName());
    }

    /**
     *
     * @return
     */
    public String getmName() {
        return mName;
    }

    /**
     *
     * @param mName
     */
    public void setmName(String mName) {
        this.mName = mName;
    }

    /**
     *
     * @return
     */
    public int getmAvailableStorageSpace() {
        return mAvailableStorageSpace;
    }

    /**
     *
     * @param mAvailableStorageSpace
     */
    public void setmAvailableStorageSpace(int mAvailableStorageSpace) {
        this.mAvailableStorageSpace = mAvailableStorageSpace;
    }

    /**
     *
     * @return
     */
    public int getmAvailableStorageWeight() {
        return mAvailableStorageWeight;
    }

    /**
     *
     * @param mAvailableStorageWeight
     */
    public void setmAvailableStorageWeight(int mAvailableStorageWeight) {
        this.mAvailableStorageWeight = mAvailableStorageWeight;
    }

}
