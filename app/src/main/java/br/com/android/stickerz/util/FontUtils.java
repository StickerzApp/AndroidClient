package br.com.android.stickerz.util;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by brunolemgruber on 10/09/15.
 */
public class FontUtils {

    public static Typeface getLight(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/Quicksand-Light.otf");
    }

    public static Typeface getBold(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/Quicksand-Bold.otf");
    }

    public static Typeface getRegular(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/Quicksand-Regular.otf");
    }

}
