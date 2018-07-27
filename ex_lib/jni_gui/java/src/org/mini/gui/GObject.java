/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mini.gui;

import java.util.Timer;
import static org.mini.gui.GToolkit.nvgRGBA;
import org.mini.gui.event.GActionListener;
import org.mini.gui.event.GFocusChangeListener;

/**
 *
 * @author gust
 */
abstract public class GObject {

    public static char ICON_SEARCH = (char) 0x1F50D;
    public static char ICON_CIRCLED_CROSS = 0x2716;
    public static char ICON_CHEVRON_RIGHT = 0xE75E;
    public static char ICON_CHECK = 0x2713;
    public static char ICON_LOGIN = 0xE740;
    public static char ICON_TRASH = 0xE729;
    //
    GContainer parent;

    //object position and width ,height
    float[] boundle = new float[4];
    static final int LEFT = 0;
    static final int TOP = 1;
    static final int WIDTH = 2;
    static final int HEIGHT = 3;

    float[] bgColor;
    float[] color;

    GActionListener actionListener;

    GFocusChangeListener focusListener;
    
    volatile static int flush;    

    boolean visable = true;

    public void init() {

    }

    void destory() {
    }
    static synchronized public void flush() {
        flush = 3;
        //in android may flush before paint,so the menu not shown
    }

    static synchronized public boolean flushReq() {
        if (flush > 0) {
            flush--;
            return true;
        }
        return false;
    }

    public Timer getTimer() {
        GForm form = getForm();
        if (form != null) {
            return form.timer;
        }
        return null;
    }

    public boolean update(long ctx) {
        return true;
    }

    public void keyEvent(int key, int scanCode, int action, int mods) {
    }

    public void characterEvent(char character) {
    }

    public void mouseButtonEvent(int button, boolean pressed, int x, int y) {
    }

    public void clickEvent(int button, int x, int y) {
    }

    public void cursorPosEvent(int x, int y) {
    }

    public void dropEvent(int count, String[] paths) {
    }

    public void scrollEvent(double scrollX, double scrollY, int x, int y) {
    }

    public static boolean isInBoundle(float[] bound, float x, float y) {
        return x >= bound[LEFT] && x <= bound[LEFT] + bound[WIDTH]
                && y >= bound[TOP] && y <= bound[TOP] + bound[HEIGHT];
    }

    public float[] getBoundle() {
        return boundle;
    }

    public GObject getParent() {
        return parent;
    }

    public void setParent(GContainer p) {
        parent = p;
    }

    public float getX() {
        if (parent != null) {
            return parent.getX() + boundle[LEFT];
        }
        return boundle[LEFT];
    }

    public float getY() {
        if (parent != null) {
            return parent.getY() + boundle[TOP];
        }
        return boundle[TOP];
    }

    public float getW() {
        return boundle[WIDTH];
    }

    public float getH() {
        return boundle[HEIGHT];
    }

    /**
     * @return the bgColor
     */
    public float[] getBgColor() {
        return bgColor;
    }

    /**
     * @param bgColor the bgColor to set
     */
    public void setBgColor(int r, int g, int b, int a) {
        bgColor = nvgRGBA((byte) r, (byte) g, (byte) b, (byte) a);
    }

    /**
     * @return the color
     */
    public float[] getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(int r, int g, int b, int a) {
        color = nvgRGBA((byte) r, (byte) g, (byte) b, (byte) a);
    }

    /**
     * @return the actionListener
     */
    public GActionListener getActionListener() {
        return actionListener;
    }

    /**
     * @param actionListener the actionListener to set
     */
    public void setActionListener(GActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void setVisable(boolean v) {
        visable = v;
    }

    public boolean isVisable() {
        return visable;
    }

    public GForm getForm() {
        GObject go = this;
        while ((go = go.parent) != null) {
            if (go instanceof GForm) {
                return (GForm) go;
            }
        }
        return null;
    }

    /**
     * @return the focusListener
     */
    public GFocusChangeListener getFocusListener() {
        return focusListener;
    }

    /**
     * @param focusListener the focusListener to set
     */
    public void setFocusListener(GFocusChangeListener focusListener) {
        this.focusListener = focusListener;
    }
}
