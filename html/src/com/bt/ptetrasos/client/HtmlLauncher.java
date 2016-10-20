package com.bt.ptetrasos.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

import com.badlogic.gdx.backends.gwt.preloader.Preloader.*;
import com.bt.ptetrasos.PTMain;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.*;


public class HtmlLauncher extends GwtApplication {


        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(480, 320);
        }

        @Override
        public ApplicationListener createApplicationListener () {
                return new PTMain();
        }

        @Override
        public PreloaderCallback getPreloaderCallback() {
            // Default screen - how does it work?
            final Panel preloaderPanel = new VerticalPanel();
            preloaderPanel.setStyleName("gdx-preloader");
            final Image logo = new Image(GWT.getModuleBaseURL() + "logo.png");
            logo.setStyleName("logo");
            preloaderPanel.add(logo);
            final Panel meterPanel = new SimplePanel();
            meterPanel.setStyleName("gdx-meter");
            meterPanel.addStyleName("red");
            final InlineHTML meter = new InlineHTML();
            final Style meterStyle = meter.getElement().getStyle();
            meterStyle.setWidth(0, Style.Unit.PCT);
            meterPanel.add(meter);
            preloaderPanel.add(meterPanel);
            getRootPanel().add(preloaderPanel);

            return new PreloaderCallback() {
                @Override
                public void error (String file) {
                    System.out.println("error: " + file);
                }

                @Override
                public void update(PreloaderState state) {
                        meterStyle.setWidth(100f * state.getProgress(), Style.Unit.PCT);
                }
            };
        }

}
