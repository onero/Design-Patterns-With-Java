/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcomposite;

import java.util.ArrayList;
import java.util.List;

public class Comment {

    private final List<Comment> mChildComments;

    private final String mComment;

    public Comment(String text) {
        mChildComments = new ArrayList<>();
        mComment = text;
    }

    /**
     * Add a new comment
     *
     * @param comment
     */
    public void addComment(Comment comment) {
        mChildComments.add(comment);
    }

    /**
     * Get the comment
     *
     * @return
     */
    public String getmComment() {
        return mComment;
    }

    @Override
    public String toString() {
        return toString(0);
    }

    /**
     * Return the given comment as a string with an explanatory arrow depicting
     * the level
     *
     * @param level
     * @return
     */
    public String toString(int level) {
        String lvl = "";
        for (int i = 0; i < level; i++) {
            lvl += "-->";
        }

        String returnString = "\n-->";
        returnString += lvl + mComment;
        for (Comment c : mChildComments) {
            returnString += c.toString(level + 1);
        }
        return returnString;
    }

}
