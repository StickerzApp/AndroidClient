package br.com.android.stickerz.activity;

import android.support.v7.widget.Toolbar;
import br.com.android.stickerz.R;

/**
 * Created by brunolemgruber on 14/08/15.
 */
public class BaseActivity extends livroandroid.lib.activity.BaseActivity {

    protected void setupToolBar(){

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
    }
}
