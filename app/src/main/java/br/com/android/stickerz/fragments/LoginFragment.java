package br.com.android.stickerz.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import br.com.android.stickerz.R;
import br.com.android.stickerz.activity.NavigationDrawerActivity;
import br.com.android.stickerz.util.FontUtils;
import livroandroid.lib.fragment.*;

/**
 * Created by brunolemgruber on 14/08/15.
 */
public class LoginFragment extends BaseFragment {

    private View view;
    private Button login;
    private Intent intent;
    private CheckBox lembraSenha;
    private TextView esqueciSenha;
    private EditText usuario;
    private EditText senha;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.login, container, false);

        login = (Button) view.findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent = new Intent(LoginFragment.this.getActivity(), NavigationDrawerActivity.class);
                startActivity(intent);
            }
        });

        lembraSenha = (CheckBox) view.findViewById(R.id.lembrarSenha);
        lembraSenha.setTypeface(FontUtils.getBold(LoginFragment.this.getActivity()));

        esqueciSenha = (TextView) view.findViewById(R.id.esqueciSenha);
        esqueciSenha.setTypeface(FontUtils.getBold(LoginFragment.this.getActivity()));

        usuario = (EditText) view.findViewById(R.id.usuario);
        usuario.setTypeface(FontUtils.getRegular(LoginFragment.this.getActivity()));

        senha = (EditText) view.findViewById(R.id.senha);
        senha.setTypeface(FontUtils.getRegular(LoginFragment.this.getActivity()));

        return view;
    }
}
