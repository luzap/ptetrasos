package com.bt.ptetrasos.components.ui;

import com.artemis.Component;

/**
 * Component that stores the text of a GUI element
 */
public class Text extends Component{

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
