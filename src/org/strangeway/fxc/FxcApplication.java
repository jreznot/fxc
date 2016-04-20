package org.strangeway.fxc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.strangeway.fxc.window.FxcWindow;

import static javafx.scene.layout.Region.USE_PREF_SIZE;

/**
 * @author Yuriy Artamonov
 */
public final class FxcApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/org/strangeway/fxc/window/fxc-window.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, USE_PREF_SIZE, USE_PREF_SIZE);
        primaryStage.setScene(scene);

        FxcWindow controller = loader.getController();
        controller.init(primaryStage);

        primaryStage.show();
    }
}