package br.com.android.stickerz.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import br.com.android.stickerz.R;
import br.com.android.stickerz.fragments.TabsFragment;

public class MainActivity extends BaseActivity {

    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = new TabsFragment();

        if(savedInstanceState == null) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.container, fragment).addToBackStack(null)
                    .commit();
        }
    }


}
