package br.com.android.stickerz.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;

import br.com.android.stickerz.R;
import br.com.android.stickerz.fragments.LoginFragment;
import br.com.android.stickerz.fragments.NewUserFragment;

/**
 * Created by brunolemgruber on 14/08/15.
 */
public class TabsAdapter extends android.support.v4.app.FragmentPagerAdapter {

    private Context context;
    private Fragment fragment;

    public TabsAdapter(Context context, android.support.v4.app.FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.login);
        }
        return context.getString(R.string.new_user);

    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            fragment = new LoginFragment();
        } else if (position == 1) {
            fragment = new NewUserFragment();
        }
        return fragment;
    }
}
