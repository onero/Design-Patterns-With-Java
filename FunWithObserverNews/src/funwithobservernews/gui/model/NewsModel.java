/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithobservernews.gui.model;

import funwithobservernews.be.News;
import funwithobservernews.bll.NewsManager;
import funwithobservernews.bll.NewsObservable;
import java.util.List;

public class NewsModel extends NewsObservable {

    private final NewsManager newsManager;

    public NewsModel() {
        newsManager = new NewsManager();
    }

    /**
     * Add news
     *
     * @param newNews
     */
    public void addNews(News newNews) {
        newsManager.addNews(newNews);
        super.notifyObservers();
    }

    /**
     * Remove news
     *
     * @param news
     */
    public void removeNews(News news) {
        newsManager.removeNews(news);
        super.notifyObservers();
    }

    /**
     * Gets all news
     *
     * @return
     */
    public List<News> getAllNews() {
        return newsManager.getAllNews();
    }

}
