package com.example.n9262.news_demo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by n9262 on 2017/6/11.
 */
public class SPUtil {
    private final static String FIRST_SP ="FIRST_SP";
    private final static String FIRST_RUN ="FIRST_RUN";

    public static boolean getIsFirstRun(Context context) {
        SharedPreferences sp = context.getSharedPreferences(FIRST_SP, Context.MODE_PRIVATE);
        return  sp.getBoolean(FIRST_RUN, true);
    }


    public static void setIsFristRun(Context context, boolean b) {
        SharedPreferences sp = context.getSharedPreferences(FIRST_SP, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(FIRST_RUN, b);
        editor.commit();
    }
}
