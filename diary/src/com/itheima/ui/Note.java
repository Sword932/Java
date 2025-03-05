package com.itheima.ui;

import java.io.Serial;
import java.io.Serializable;

public class Note implements Serializable {
    @Serial
    private static final long serialVersionUID = 5492958025019128379L;
    private int index;
    private String title;
    private String text;

    public Note() {
    }

    public Note(int index, String title, String text) {
        this.index = index;
        this.title = title;
        this.text = text;
    }

    /**
     * 获取
     * @return index
     */
    public int getIndex() {
        return index;
    }

    /**
     * 设置
     * @param index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * 设置
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "index=" + index + "@title=" + title + "@text=" + text;
    }
}
