package br.com.android.stickerz.domain;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brunolemgruber on 13/09/15.
 */
public class CampaignService {

//    private static final String URL = "http://www.livroiphone.com.br/carros/carros_{tipo}.json";
//    private static final boolean LOG_ON = false;
//    private static final String TAG = "CarroService";

    public static List<Campaign> getCampaign(Context context) {
        List<Campaign> campaigns = new ArrayList<Campaign>();
        for (int i = 0; i < 20; i++) {
            Campaign c = new Campaign();
            c.setNome("McDonalds");
            c.setDescricao("Uma nova campanha para você ganhar vários prêmios e para trocar seus stickerz repetidos e bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla");
            c.setImagem("http://logok.org/wp-content/uploads/2014/06/McDonalds-logo.png");
            c.setNiveis("10");
            campaigns.add(c);
        }
        return campaigns;
    }
}
