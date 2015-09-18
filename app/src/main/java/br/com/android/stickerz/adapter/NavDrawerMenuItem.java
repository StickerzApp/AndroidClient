package br.com.android.stickerz.adapter;

import java.util.ArrayList;
import java.util.List;

import br.com.android.stickerz.R;

/**
 * Created by brunolemgruber on 21/08/15.
 */
public class NavDrawerMenuItem {

    // Título: R.string.xxx
    public int title;
    // Figura: R.drawable.xxx
    public int img;
    // Para colocar um fundo cinza quando a linha está selecionada
    public boolean selected;

    public NavDrawerMenuItem(int title, int img) {
        this.title = title;
        this.img = img;
    }

    // Cria a lista com os itens de menu
    public static List<NavDrawerMenuItem> getList() {
        List<NavDrawerMenuItem> list = new ArrayList<NavDrawerMenuItem>();
        list.add(new NavDrawerMenuItem(R.string.profile, R.drawable.profile));
        list.add(new NavDrawerMenuItem(R.string.campaign, R.drawable.campaign));
        list.add(new NavDrawerMenuItem(R.string.friends, R.drawable.friends));
        list.add(new NavDrawerMenuItem(R.string.config, R.drawable.config));
        list.add(new NavDrawerMenuItem(R.string.logout, R.drawable.logout));
        return list;
    }
}
