package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class ChooseTroopTypeActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    CardView white;
    CardView dark;
    CardView heroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_troop_type);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        white = (CardView) findViewById(R.id.white);
        dark = (CardView) findViewById(R.id.dark);
        heroes = (CardView) findViewById(R.id.heroes);

        white.setOnClickListener(whiteListener);
        dark.setOnClickListener(darkListener);
        heroes.setOnClickListener(heroesListener);
    }

    private View.OnClickListener whiteListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseTroopWhiteActivity.class));
        }
    };

    private View.OnClickListener darkListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseTroopDarkActivity.class));
        }
    };

    private View.OnClickListener heroesListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseTroopHeroActivity.class));
        }
    };
}
