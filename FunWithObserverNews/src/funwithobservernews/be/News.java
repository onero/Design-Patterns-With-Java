/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithobservernews.be;

public class News {

    private final String mAuthor;

    private final String mContent;

    public News(String author, String title) {
        mAuthor = author;
        mContent = title;
    }

    public String getContent() {
        return mContent;
    }

    @Override
    public String toString() {
        return mAuthor + ": " + mContent;
    }

}
