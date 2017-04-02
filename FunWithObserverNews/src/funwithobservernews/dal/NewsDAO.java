/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithobservernews.dal;

import funwithobservernews.be.News;
import java.util.ArrayList;
import java.util.List;

public class NewsDAO {

    private final List<News> newsList;

    public NewsDAO() {
        newsList = new ArrayList<>();
        newsList.add(new News("Adam ", "This is awesome"));
        newsList.add(new News("Adam ", "This is even better"));
        newsList.add(new News("Adam ", "Some news..."));
        newsList.add(new News("Adam ", "This is awesome"));
        newsList.add(new News("Adam ", "This is even better"));
        newsList.add(new News("Adam ", "Some news..."));
        newsList.add(new News("Adam ", "This is awesome"));
        newsList.add(new News("Adam ", "This is even better"));
        newsList.add(new News("Adam ", "Some news..."));
        newsList.add(new News("Adam ", "This is awesome"));
        newsList.add(new News("Adam ", "This is even better"));
        newsList.add(new News("Adam ", "Some news..."));
    }

    /**
     * Add news to the DB
     */
    public void addNews(News news) {
        newsList.add(news);
    }

    /**
     * Remove news form the DB
     */
    public void removeNews(News news) {
        newsList.remove(news);
    }

    /**
     * Gets all news from the DB
     *
     * @return
     */
    public List<News> getAllNews() {
        return newsList;
    }

}
