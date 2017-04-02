/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithobservernews.gui.controller;

import funwithobservernews.be.News;
import funwithobservernews.gui.model.NewsModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author gta1
 */
public class ObserverNewsMainController implements Initializable {

    NewsModel newsModel;

    @FXML
    private TextField txtNews;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        newsModel = new NewsModel();
        try {
            createNewsView();
        } catch (IOException ex) {
            Logger.getLogger(ObserverNewsMainController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void handleAddNews(ActionEvent event) {
        newsModel.addNews(new News("Adam", txtNews.getText()));
        txtNews.clear();
    }

    /**
     * Create the mews voew
     *
     * @throws IOException
     */
    private void createNewsView() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/funwithobservernews/gui/view/NewsView.fxml"));
        Parent root;
        root = loader.load();
        NewsViewController controller = loader.getController();
        controller.setModel(newsModel);

        Stage stage = new Stage();
        stage.initModality(Modality.NONE);
        stage.initStyle(StageStyle.UTILITY);

        stage.setScene(new Scene(root));
        stage.show();
    }

}
