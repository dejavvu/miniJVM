/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mini.glfm;

/**
 *
 * @author gust
 */
public interface GlfmCallBack {

    //void onFrame(GLFMDisplay *display, double frameTime)
    void mainLoop(long display, double frameTime);

    //bool onTouch(GLFMDisplay *display, int touch, GLFMTouchPhase phase, double x, double y)
    boolean onTouch(long display, int touch, int phase, double x, double y);

    //bool onKey(GLFMDisplay *display, GLFMKey keyCode, GLFMKeyAction action, int modifiers)
    boolean onKey(long display, int keyCode, int action, int modifiers);

    public void onCharacter(long display, String str, int modifiers);

    public void onKeyboardVisible(long display, boolean visible, double x, int y, double w, int h);

    public void onSurfaceError(long display, String description);

    //void onSurfaceCreated(GLFMDisplay *display, int width, int height)
    void onSurfaceCreated(long display, int width, int height);

    public void onSurfaceResize(long display, int width, int height);

    //void onSurfaceDestroyed(GLFMDisplay *display);
    void onSurfaceDestroyed(long display);

    public void onMemWarning(long display);

    public void onAppFocus(long display, boolean focused);

}