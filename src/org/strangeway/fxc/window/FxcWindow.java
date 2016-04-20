package org.strangeway.fxc.window;

import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author Yuriy Artamonov
 */
public class FxcWindow {

    public void init(Stage primaryStage) {
        primaryStage.setTitle("FX Client");
        setWindowIcons(primaryStage);
    }

    private void setWindowIcons(Stage stage) {
        ObservableList<Image> appIcons = stage.getIcons();
        appIcons.add(new Image(getClass().getResourceAsStream("monitor.png")));
    }
}