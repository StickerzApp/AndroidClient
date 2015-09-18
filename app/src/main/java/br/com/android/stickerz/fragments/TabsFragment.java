package br.com.android.stickerz.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import br.com.android.stickerz.R;
import br.com.android.stickerz.adapter.TabsAdapter;
import livroandroid.lib.fragment.*;

/**
 * Created by brunolemgruber on 14/08/15.
 */
public class TabsFragment extends BaseFragment implements TabLayout.OnTabSelectedListener{

    private ViewPager mViewPager;
    private TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab_adapter, container, false);
        mViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mViewPager.setAdapter(new TabsAdapter(TabsFragment.this.getActivity(), getChildFragmentManager()));

        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);

        // Cor branca no texto (fundo azul foi definido no layout)
        tabLayout.setTabTextColors(TabsFragment.this.getActivity().getResources().getColor(R.color.black),
                TabsFragment.this.getActivity().getResources().getColor(R.color.orange_light));
        // Adiciona as tabs.
        tabLayout.addTab(tabLayout.newTab().setText(R.string.login));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.new_user));
        // Listener para tratar eventos de clique na tab.
        tabLayout.setOnTabSelectedListener(this);

        // Se mudar o ViewPager atualiza a tab selecionada.
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        return view;
    }
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        // Se alterar a tab, atualiza o ViewPager
        mViewPager.setCurrentItem(tab.getPosition());
    }
    @Override
    public void onTabUnselected(TabLayout.Tab tab) { }
    @Override
    public void onTabReselected(TabLayout.Tab tab) { }
}

