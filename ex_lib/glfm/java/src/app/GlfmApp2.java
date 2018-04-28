/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.File;
import org.mini.glfm.Glfm;
import org.mini.gui.GApplication;
import org.mini.gui.GForm;
import org.mini.gui.GFrame;
import org.mini.gui.GGraphics;
import org.mini.gui.GImage;
import org.mini.gui.GList;
import org.mini.gui.GMenu;
import org.mini.gui.GObject;
import org.mini.gui.GuiCallBack;
import org.mini.gui.event.GActionListener;

/**
 *
 * @author Gust
 */
public class GlfmApp2 implements GApplication {

    private static GlfmApp2 app;

    GForm form;
    GMenu menu;
    int menuH = 80;

    static public GlfmApp2 getInstance() {
        if (app == null) {
            app = new GlfmApp2();
        }
        return app;
    }

    @Override
    public GForm createdForm(final GuiCallBack ccb) {
        if (form != null) {
            return form;
        }
        
        form = new GForm(/*"GuiTest"*/"登录 窗口", 800, 600, ccb);

        form.setFps(30f);
        long vg = form.getNvContext();
        GFrame gframe = new GFrame("第二个应用", 0, 0, ccb.getDeviceWidth(), ccb.getDeviceHeight() - menuH);
        form.add(gframe);
        gframe.align(GGraphics.TOP | GGraphics.HCENTER);

        GList list = new GList(0, 0, (int) gframe.getPanel().getW(), (int) (gframe.getPanel().getH() - 40));
        //list.setMode(GList.MODE_MULTI_LINE);
        gframe.add(list);

        String resRoot = Glfm.glfmGetResRoot();
        File f = new File(resRoot);
        if (f.exists()) {
            String[] files = f.list();
            int[] imgs=new int[files.length];
            list.setItems(imgs, files);
        }
        list.setActionListener(new GActionListener() {
            @Override
            public void action(GObject gobj) {
                GList glist = (GList) gobj;
                int selectIndex = glist.getSelectedIndex();
                System.out.println(glist.getLabels()[selectIndex]);
            }
        });

        GImage img = new GImage("./image4.png");
        menu = new GMenu(0, form.getDeviceHeight() - menuH, form.getDeviceWidth(), menuH);
        menu.addItem("主页", img);
        menu.addItem("搜索", img);
        menu.addItem("发现", img);
        menu.addItem("我的", img);
        menu.addItem("退出", img);
        form.add(menu);
        menu.setActionListener(new GActionListener() {
            @Override
            public void action(GObject gobj) {
                GMenu m = (GMenu) gobj;
                switch (m.getSelectIndex()) {
                    case 4: {
                        ccb.setApplication(GlfmMain.getInstance());
                        break;
                    }

                }
            }
        });

        return form;
    }
}
