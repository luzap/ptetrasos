package com.bt.ptetrasos.components.ui;

import com.artemis.Component;

/**
 * UI element for options menu
 */
public class Slider extends Component{

    float defValue;
    float curValue;

    public Slider() {}

    public Slider(float defaultValue, float currentValue) {
        this.defValue = defaultValue;
        this.curValue = currentValue;
    }

    public float getDefValue() {
        return defValue;
    }

    public void setDefValue(float defValue) {
        this.defValue = defValue;
    }

    public float getCurValue() {
        return curValue;
    }

    public void setCurValue(float curValue) {
        this.curValue = curValue;
    }
}
