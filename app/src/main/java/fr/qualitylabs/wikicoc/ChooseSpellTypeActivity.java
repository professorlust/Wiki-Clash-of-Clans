package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class ChooseSpellTypeActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    CardView whiteSpell;
    CardView darkSpell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_spell_type);

        //        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        whiteSpell = (CardView) findViewById(R.id.white_spell);
        darkSpell = (CardView) findViewById(R.id.dark_spell);

        whiteSpell.setOnClickListener(whiteSpellListener);
        darkSpell.setOnClickListener(darkSpellListener);
    }

    private View.OnClickListener whiteSpellListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseSpellWhiteActivity.class));
        }
    };

    private View.OnClickListener darkSpellListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseSpellDarkActivity.class));
        }
    };
}
