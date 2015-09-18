package br.com.android.stickerz.domain;

import java.io.Serializable;

/**
 * Created by brunolemgruber on 12/09/15.
 */
public class Campaign implements Serializable {

    private static final long serialVersionUID = 6601006766832473959L;

    private String nome;

    private String imagem;

    private String descricao;

    private String niveis;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNiveis() {
        return niveis;
    }

    public void setNiveis(String niveis) {
        this.niveis = niveis;
    }
}
