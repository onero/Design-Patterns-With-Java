/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2016afunwithstrategypattern.bll;

public class TextDecorator {

    private final TextDecorationStrategy[] mStrategies;

    public TextDecorator(TextDecorationStrategy... strategy) {
        mStrategies = strategy;
    }

    public String applyStrategies(String mText) {
        String decorated = mText;
        for (TextDecorationStrategy mStrategy : mStrategies) {
            decorated = mStrategy.decorateText(mText);
        }
        return decorated;
    }

}
