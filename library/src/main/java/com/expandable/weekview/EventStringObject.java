package com.expandable.weekview;

/**
 * Created by thejanthrimanna on 2020-04-20.
 */
public class EventStringObject {
    private String text;
    private Boolean isBold;
    private Boolean isShow;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getBold() {
        return isBold;
    }

    public void setBold(Boolean bold) {
        isBold = bold;
    }

    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
    }
}
