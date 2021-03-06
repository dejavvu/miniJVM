/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mini.gui;

import org.mini.glfm.Glfm;
import static org.mini.gui.GToolkit.nvgRGBA;
import org.mini.nanovg.Nanovg;
import static org.mini.nanovg.Nanovg.NVG_HOLE;
import static org.mini.nanovg.Nanovg.nvgBeginPath;
import static org.mini.nanovg.Nanovg.nvgBoxGradient;
import static org.mini.nanovg.Nanovg.nvgCircle;
import static org.mini.nanovg.Nanovg.nvgFill;
import static org.mini.nanovg.Nanovg.nvgFillColor;
import static org.mini.nanovg.Nanovg.nvgFillPaint;
import static org.mini.nanovg.Nanovg.nvgLinearGradient;
import static org.mini.nanovg.Nanovg.nvgPathWinding;
import static org.mini.nanovg.Nanovg.nvgRadialGradient;
import static org.mini.nanovg.Nanovg.nvgRect;
import static org.mini.nanovg.Nanovg.nvgRestore;
import static org.mini.nanovg.Nanovg.nvgRoundedRect;
import static org.mini.nanovg.Nanovg.nvgSave;
import static org.mini.nanovg.Nanovg.nvgStroke;
import static org.mini.nanovg.Nanovg.nvgStrokeColor;

/**
 *
 * @author gust
 */
public class GScrollBar extends GObject {

    String text;
    float pos;
    boolean draged;
    public static final int HORIZONTAL = 0, VERTICAL = 1;
    int mode = HORIZONTAL;
    float radius = 8;

    public GScrollBar(float pos, int mode, int left, int top, int width, int height) {
        this.pos = pos;
        this.mode = mode;
        boundle[LEFT] = left;
        boundle[TOP] = top;
        boundle[WIDTH] = width;
        boundle[HEIGHT] = height;
    }

    public float getPos() {
        return pos;
    }

    public void setPos(float p) {
        pos = p;
        if (pos > 1) {
            pos = 1.f;
        }
        if (pos < 0) {
            pos = 0.f;
        }
    }

    @Override
    public void touchEvent(int phase, int x, int y) {
        int rx = (int) (x - parent.getX());
        int ry = (int) (y - parent.getY());
        if (isInBoundle(boundle, rx, ry)) {
            if (phase == Glfm.GLFMTouchPhaseBegan) {
                draged = true;
                pos = mode == HORIZONTAL ? (rx - boundle[LEFT]) / boundle[WIDTH] : (ry - boundle[TOP]) / boundle[HEIGHT];
            } else if (phase == Glfm.GLFMTouchPhaseEnded) {
                draged = false;
                if (actionListener != null) {
                    actionListener.action(this);
                }
            } else if (isInBoundle(boundle, rx, ry)) {
                if (draged) {
                    pos = mode == HORIZONTAL ? (rx - boundle[LEFT]) / boundle[WIDTH] : (ry - boundle[TOP]) / boundle[HEIGHT];
                }
            }
        }
    }

    /**
     *
     * @param vg
     * @return
     */
    public boolean update(long vg) {
        float x = getX();
        float y = getY();
        float w = getW();
        float h = getH();

        Nanovg.nvgScissor(vg, x - radius, y - radius, w + radius * 2, h + radius * 2);

        if (mode == HORIZONTAL) {
            drawSliderH(vg, pos, x, y, w, h);
        } else {
            drawSliderV(vg, pos, x, y, w, h);
        }
        return true;
    }

    void drawSliderH(long vg, float pos, float x, float y, float w, float h) {
        byte[] bg, knob;
        float cy = y + (int) (h * 0.5f);
        float kr = radius;//(int) (h * 0.25f);

        nvgSave(vg);
//	nvgClearState(vg);

        // Slot
        bg = nvgBoxGradient(vg, x, cy - 2 + 1, w, 4, 2, 2, nvgRGBA(0, 0, 0, 32), nvgRGBA(0, 0, 0, 128));
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x, cy - 2, w, 4, 2);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        // Knob Shadow
        bg = nvgRadialGradient(vg, x + (int) (pos * w), cy + 1, kr - 3, kr + 3, nvgRGBA(0, 0, 0, 64), nvgRGBA(0, 0, 0, 0));
        nvgBeginPath(vg);
        nvgRect(vg, x + (int) (pos * w) - kr - 5, cy - kr - 5, kr * 2 + 5 + 5, kr * 2 + 5 + 5 + 3);
        nvgCircle(vg, x + (int) (pos * w), cy, kr);
        nvgPathWinding(vg, NVG_HOLE);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        // Knob
        knob = nvgLinearGradient(vg, x, cy - kr, x, cy + kr, nvgRGBA(255, 255, 255, 16), nvgRGBA(0, 0, 0, 16));
        nvgBeginPath(vg);
        nvgCircle(vg, x + (int) (pos * w), cy, kr - 1);
        nvgFillColor(vg, nvgRGBA(40, 43, 48, 255));
        nvgFill(vg);
        nvgFillPaint(vg, knob);
        nvgFill(vg);

        nvgBeginPath(vg);
        nvgCircle(vg, x + (int) (pos * w), cy, kr - 0.5f);
        nvgStrokeColor(vg, nvgRGBA(0, 0, 0, 92));
        nvgStroke(vg);

        nvgRestore(vg);
    }

    void drawSliderV(long vg, float pos, float x, float y, float w, float h) {
        byte[] bg, knob;
//        float cy = y + (int) (h * 0.5f);
        float cx = x + (int) (w * 0.5f);
        float kr = radius;//(int) (w * 0.25f);

        nvgSave(vg);
//	nvgClearState(vg);

        // Slot
//        bg = nvgBoxGradient(vg, x, cx - 2 + 1, w, 4, 2, 2, nvgRGBA(0, 0, 0, 32), nvgRGBA(0, 0, 0, 128));
        bg = nvgBoxGradient(vg, cx - 2 + 1, y, 4, h, 2, 2, nvgRGBA(0, 0, 0, 32), nvgRGBA(0, 0, 0, 128));
        nvgBeginPath(vg);
        nvgRoundedRect(vg, cx - 2, y, 4, h, 2);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        // Knob Shadow
//        bg = nvgRadialGradient(vg, x + (int) (pos * w), cx + 1, kr - 3, kr + 3, nvgRGBA(0, 0, 0, 64), nvgRGBA(0, 0, 0, 0));
        bg = nvgRadialGradient(vg, cx + 1, y + (int) (pos * h), kr - 3, kr + 3, nvgRGBA(0, 0, 0, 64), nvgRGBA(0, 0, 0, 0));
        nvgBeginPath(vg);
//        nvgRect(vg, x + (int) (pos * w) - kr - 5, cx - kr - 5, kr * 2 + 5 + 5, kr * 2 + 5 + 5 + 3);
        nvgRect(vg, cx - kr - 5, y + (int) (pos * h) - kr - 5, kr * 2 + 5 + 5, kr * 2 + 5 + 5 + 3);
//        nvgCircle(vg, x + (int) (pos * w), cx, kr);
        nvgCircle(vg, cx, y + (int) (pos * h), kr);
        nvgPathWinding(vg, NVG_HOLE);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        // Knob
//        knob = nvgLinearGradient(vg, x, cx - kr, x, cx + kr, nvgRGBA(255, 255, 255, 16), nvgRGBA(0, 0, 0, 16));
        knob = nvgLinearGradient(vg, cx - kr, y, x, cx + kr, nvgRGBA(255, 255, 255, 16), nvgRGBA(0, 0, 0, 16));
        nvgBeginPath(vg);
//        nvgCircle(vg, x + (int) (pos * w), cx, kr - 1);
        nvgCircle(vg, cx, y + (int) (pos * h), kr - 1);
        nvgFillColor(vg, nvgRGBA(40, 43, 48, 255));
        nvgFill(vg);
        nvgFillPaint(vg, knob);
        nvgFill(vg);

        nvgBeginPath(vg);
//        nvgCircle(vg, x + (int) (pos * w), cx, kr - 0.5f);
        nvgCircle(vg, cx, y + (int) (pos * h), kr - 0.5f);
        nvgStrokeColor(vg, nvgRGBA(0, 0, 0, 92));
        nvgStroke(vg);

        nvgRestore(vg);
    }

}
