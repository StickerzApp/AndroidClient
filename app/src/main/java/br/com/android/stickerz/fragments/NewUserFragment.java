package br.com.android.stickerz.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import br.com.android.stickerz.R;
import br.com.android.stickerz.util.FontUtils;
import livroandroid.lib.fragment.*;

/**
 * Created by brunolemgruber on 14/08/15.
 */
public class NewUserFragment extends BaseFragment {

    private View view;
    private EditText email;
    private EditText senha;
    private EditText confSenha;
    private TextView accepted;
    private TextView termo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.new_user, container, false);

        email = (EditText) view.findViewById(R.id.email);
        email.setTypeface(FontUtils.getRegular(NewUserFragment.this.getActivity()));
        senha = (EditText) view.findViewById(R.id.senha);
        senha.setTypeface(FontUtils.getRegular(NewUserFragment.this.getActivity()));
        confSenha = (EditText) view.findViewById(R.id.confSenha);
        confSenha.setTypeface(FontUtils.getRegular(NewUserFragment.this.getActivity()));
        accepted = (TextView) view.findViewById(R.id.accepted);
        accepted.setTypeface(FontUtils.getBold(NewUserFragment.this.getActivity()));
        termo = (TextView) view.findViewById(R.id.termo);
        termo.setTypeface(FontUtils.getBold(NewUserFragment.this.getActivity()));

        return view;
    }
}
