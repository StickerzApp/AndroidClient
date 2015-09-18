package br.com.android.stickerz.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.util.List;
import br.com.android.stickerz.R;
import br.com.android.stickerz.adapter.NavDrawerMenuAdapter;
import br.com.android.stickerz.adapter.NavDrawerMenuItem;
import br.com.android.stickerz.fragments.CampaignFragment;
import livroandroid.lib.fragment.NavigationDrawerFragment;

/**
 * Created by brunolemgruber on 26/08/15.
 */
public class NavigationDrawerActivity extends BaseActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private NavigationDrawerFragment navigationDrawerFragment;
    private NavDrawerMenuAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer_activity);
        setupToolBar();
        navigationDrawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.nav_drawer_fragment);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationDrawerFragment.setUp(drawerLayout);
        drawerLayout.setStatusBarBackground(R.color.primary_dark);
    }

    @Override
    public NavigationDrawerFragment.NavDrawerListView getNavDrawerView(NavigationDrawerFragment navigationDrawerFragment, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View view = layoutInflater.inflate(R.layout.nav_drawer_listview, viewGroup, false);
        navigationDrawerFragment.setHeaderValues(view, R.id.listViewContainer, R.drawable.nav_drawer_header, R.drawable.ic_logo_user, R.string.nav_drawer_username, R.string.nav_drawer_email);
        return new NavigationDrawerFragment.NavDrawerListView(view,R.id.listView);
    }

    @Override
    public ListAdapter getNavDrawerListAdapter(NavigationDrawerFragment navigationDrawerFragment) {
        List<NavDrawerMenuItem> list = NavDrawerMenuItem.getList();
        list.get(0).selected = true;
        this.listAdapter = new NavDrawerMenuAdapter(this,list);
        return listAdapter;
    }

    @Override
    public void onNavDrawerItemSelected(NavigationDrawerFragment navigationDrawerFragment, int position) {
        List<NavDrawerMenuItem> list = NavDrawerMenuItem.getList();
        NavDrawerMenuItem selectedItem = list.get(position);
        this.listAdapter.setSelected(position,true);

        if(position == 0){
            //replaceFragment(new CarrosTabFragment());
        }else if(position == 1){
            replaceFragment(new CampaignFragment());
        }else if (position == 2){

        }else if (position == 3){

        }
    }

    private void replaceFragment(Fragment frag){
        getSupportFragmentManager().beginTransaction().replace(R.id.nav_drawer_conteiner,frag,"TAG").commit();
    }
}
