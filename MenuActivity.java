package paintlike.com.paintlike;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    Button btnDessinVierge, btnFuturama, btnSimpson, btnRickMorty, btnAmericanDad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnDessinVierge = (Button) findViewById(R.id.dessin_vierge);
        btnFuturama = (Button) findViewById(R.id.bouton_futurama);
        btnSimpson = (Button) findViewById(R.id.bouton_simpson);
        btnRickMorty = (Button) findViewById(R.id.bouton_rickmorty);
        btnAmericanDad = (Button) findViewById(R.id.bouton_americandad);


        btnDessinVierge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });

        btnRickMorty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, RickMorty.class));
            }
        });

        btnFuturama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, FuturamaActivity.class));
            }


        });

        btnSimpson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this, SimpsonActivity.class));
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
