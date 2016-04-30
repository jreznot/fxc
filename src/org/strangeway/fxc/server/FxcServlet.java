package org.strangeway.fxc.server;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;
import org.strangeway.fxc.app.FxcUI;

import javax.servlet.annotation.WebServlet;

/**
 * @author Yuriy Artamonov
 */
@WebServlet(value = "/*")
@VaadinServletConfiguration(productionMode = false, ui = FxcUI.class)
public final class FxcServlet extends VaadinServlet {
}