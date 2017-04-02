/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithobservernews.gui.controller;

import funwithobservernews.be.News;
import funwithobservernews.bll.NewsObserver;
import funwithobservernews.gui.model.NewsModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author gta1
 */
public class NewsViewController implements Initializable, NewsObserver {

    private NewsModel newsModel;

    @FXML
    private ListView<News> listView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void setModel(NewsModel newsModel) {
        this.newsModel = newsModel;
        newsModel.attachObserver(this);
        update();

    }

    @Override
    public void update() {
        listView.setItems(FXCollections.observableArrayList(newsModel.getAllNews()));
    }

}
