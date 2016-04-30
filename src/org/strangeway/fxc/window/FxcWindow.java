package org.strangeway.fxc.window;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.strangeway.fxc.server.FxcServer;

/**
 * @author Yuriy Artamonov
 */
public class FxcWindow {

    @FXML
    private WebView webview;

    public void init(Stage primaryStage) {
        primaryStage.setTitle("FX Client");
        setWindowIcons(primaryStage);

        primaryStage.setOnCloseRequest(event -> FxcServer.stop());

        Platform.runLater(() ->
                webview.getEngine().load("http://localhost:8080/app")
        );
    }

    private void setWindowIcons(Stage stage) {
        ObservableList<Image> appIcons = stage.getIcons();
        appIcons.add(new Image(getClass().getResourceAsStream("monitor.png")));
    }
}