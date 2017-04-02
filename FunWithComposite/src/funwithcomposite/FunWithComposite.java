/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithcomposite;

/**
 *
 * @author Adamino
 */
public class FunWithComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comment primaryComment = new Comment("Forum about music");
        Comment firstCategory = new Comment("Intonation issues");
        Comment secondCategory = new Comment("Rythmical issues");

        //Comments for first category
        Comment firstCategoryFirstReply = new Comment("I can't play in tune!");

        Comment firstCategorySecondReply = new Comment("I always play in tune!");

        //Comments for secodn category
        Comment secondCategoryFirstReply = new Comment("I am not rythmical");
        Comment secondCategorySecondReply = new Comment("I am rythmical!");

        //First category (Intonation)
        primaryComment.addComment(firstCategory);
        firstCategory.addComment(firstCategoryFirstReply);
        firstCategory.addComment(firstCategorySecondReply);

        //Second category (Rythmical)
        primaryComment.addComment(secondCategory);
        secondCategory.addComment(secondCategoryFirstReply);
        secondCategory.addComment(secondCategorySecondReply);

        System.out.println(primaryComment.toString());

    }

}
