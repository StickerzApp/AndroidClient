package br.com.android.stickerz;

import android.app.Application;

/**
 * Created by brunolemgruber on 26/08/15.
 */
public class StickerzApplication extends Application {

    private static StickerzApplication instance = null;

    public StickerzApplication getInstance(){
        return  instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
