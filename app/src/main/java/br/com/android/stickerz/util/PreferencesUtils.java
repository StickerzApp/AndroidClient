package br.com.android.stickerz.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by brunolemgruber on 22/09/15.
 */
public class PreferencesUtils {

    private static SharedPreferences settings;
    private static boolean sucesso;
    private static String value;
    private static String PREFS_NAME = "Stickerz";

    public static boolean removePreference(Context context,String key,String value){

        settings = context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        sucesso = settings.edit().remove(key).commit();
        return sucesso;
    }

    public static boolean addPreference(Context context,String key,String value){

        settings = context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        sucesso = settings.edit().putString(key, value).commit();
        return  sucesso;
    }

    public static String getPreference(Context context,String key){

        settings = context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        value = settings.getString(key,"0");
        return  value;
    }

}
