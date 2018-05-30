package com.androidfizz.logutil;

import android.util.Log;

public class Logger {

    private static final String TAG = Logger.class.getSimpleName();

    public static void  d(String msg){
        Log.d(TAG,msg);
    }
}
