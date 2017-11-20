package paintlike.com.paintlike;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button btnGoToMonProfil, btnGoToCreerChampionnat, btnGoToRejoindreChampionnat, btnDeconnexion, btnAmericanDad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnGoToMonProfil = (Button) findViewById(R.id.btn_go_to_mon_profil);
        btnGoToCreerChampionnat = (Button) findViewById(R.id.btn_go_to_creer_championnat);
        btnGoToRejoindreChampionnat = (Button) findViewById(R.id.btn_go_to_rejoindre_championnat);
        btnDeconnexion = (Button) findViewById(R.id.btn_deconnexion);
        btnAmericanDad = (Button) findViewById(R.id.american_dad);


        btnGoToCreerChampionnat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });

        btnGoToRejoindreChampionnat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, SimpsonActivity.class));
            }
        });

        btnDeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, RickMorty.class));
            }


        });

        btnGoToMonProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, FuturamaActivity.class));
            }
        });


        btnAmericanDad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, AmericanDad.class));
            }
        });
    }

}
