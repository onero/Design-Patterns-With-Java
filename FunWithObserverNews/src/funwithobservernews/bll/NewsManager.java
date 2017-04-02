/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithobservernews.bll;

import funwithobservernews.be.News;
import funwithobservernews.dal.NewsDAO;
import java.util.List;

public class NewsManager {

    private final NewsDAO dao = new NewsDAO();

    /**
     * Add news
     *
     * @param newNews
     */
    public void addNews(News newNews) {
        dao.addNews(newNews);
    }

    /**
     * Remove news
     *
     * @param news
     */
    public void removeNews(News news) {
        dao.removeNews(news);
    }

    /**
     * Get all news
     *
     * @return
     */
    public List<News> getAllNews() {
        return dao.getAllNews();
    }

}
