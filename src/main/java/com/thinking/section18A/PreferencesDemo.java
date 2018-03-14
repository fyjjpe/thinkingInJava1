package com.thinking.section18A;

import java.util.prefs.Preferences;

/**
 * Created by yuanjie.fang on 2017/12/29.
 */
public class PreferencesDemo {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userNodeForPackage(PreferencesDemo.class);
    }
}
