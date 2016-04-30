package org.strangeway.fxc;

import javafx.application.Application;
import org.strangeway.fxc.server.FxcServer;

/**
 * @author Yuriy Artamonov
 */
public final class FxcLauncher {

    public static void main(String[] args) {
        FxcServer.start();

        Application.launch(FxcApplication.class);
    }
}