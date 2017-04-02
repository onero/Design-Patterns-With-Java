/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithianda;

import funwithianda.be.CardBoardBox;
import funwithianda.be.ITruckLoadable;
import funwithianda.be.Truck;
import funwithianda.be.Tube;

/**
 *
 * @author Adamino
 */
public class FunWithIandA {

    private static final int LOAD_TIMES = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Truck truck = new Truck("AwesomeTruck", 160_000, 4000);

        ITruckLoadable box = new CardBoardBox("30 pairs of underpants", 47, 35, 25, 15);

        ITruckLoadable tube = new Tube("Big Tube", 50, 10, 50);

        if (truck.canLoad(box)) {
            truck.loadCargo(box);
        }
        if (truck.canLoad(tube)) {
            truck.loadCargo(tube);
        }

    }

}
