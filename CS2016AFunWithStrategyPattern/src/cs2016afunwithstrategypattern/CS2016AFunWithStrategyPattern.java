/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016afunwithstrategypattern;

import cs2016afunwithstrategypattern.bll.StrategyAllCaps;
import cs2016afunwithstrategypattern.bll.StrategyUpperCase;
import cs2016afunwithstrategypattern.bll.StrategyWideSpacing;
import cs2016afunwithstrategypattern.bll.TextDecorationStrategy;
import cs2016afunwithstrategypattern.bll.TextDecorator;

/**
 *
 * @author Adamino
 */
public class CS2016AFunWithStrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mText = "All carneys are evil!";

        TextDecorationStrategy uc = new StrategyUpperCase();

        TextDecorationStrategy ws = new StrategyWideSpacing();

        TextDecorationStrategy alt = new StrategyAllCaps();

        TextDecorator decorator = new TextDecorator(
                uc,
                alt,
                new StrategySomManSiger());

        System.out.println("Before: " + mText);
        System.out.println("After: " + decorator.applyStrategies(mText));

    }

    private static class StrategySomManSiger implements TextDecorationStrategy {

        @Override
        public String decorateText(String input) {
            return input + ", som man siger!";
        }

    }

}
