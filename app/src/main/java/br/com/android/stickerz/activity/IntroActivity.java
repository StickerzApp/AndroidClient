package br.com.android.stickerz.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

import br.com.android.stickerz.R;
import br.com.android.stickerz.util.PreferencesUtils;

/**
 * Created by brunolemgruber on 22/09/15.
 */
public class IntroActivity extends AppIntro2 {

    @Override
    public void init(@Nullable Bundle bundle) {

        if (PreferencesUtils.getPreference(IntroActivity.this, "login").equalsIgnoreCase("0")){

            addSlide(AppIntroFragment.newInstance("Funcionamento", "Aqui terá como que funciona o stickerz", R.drawable.ic_slide1, Color.parseColor("#e67e22")));
            addSlide(AppIntroFragment.newInstance("Seus sticker", "Aqui será o que são os stickerz", R.drawable.ic_slide2, Color.parseColor("#e67e22")));
            addSlide(AppIntroFragment.newInstance("Amigos", "Aqui será como que funcionará a questão dos seus amigos", R.drawable.ic_slide3, Color.parseColor("#e67e22")));
            addSlide(AppIntroFragment.newInstance("Trocas", "Aqui será a descrição de como que funcionará as trocas ", R.drawable.ic_slide4, Color.parseColor("#e67e22")));
            addSlide(AppIntroFragment.newInstance("Resgates", "Aqui será a descrição de como que funcionará os regastes", R.drawable.ic_slide1, Color.parseColor("#e67e22")));

        } else{

            loadMainActivity();

        }
    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }
}
