package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class ChooseSpellDarkActivity extends ActionBarActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    Spell spell = new Spell();

    CardView poison;
    CardView earthquake;
    CardView haste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_spell_dark);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        poison = (CardView) findViewById(R.id.poison);
        earthquake = (CardView) findViewById(R.id.earthquake);
        haste = (CardView) findViewById(R.id.haste);

        poison.setOnClickListener(poisonListener);
        earthquake.setOnClickListener(earthquakeListener);
        haste.setOnClickListener(hasteListener);
    }

    private View.OnClickListener poisonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeSpellPoisonActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener earthquakeListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeSpellEarthquakeActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener hasteListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeSpellHasteActivity.class);
            startActivity(intent);
        }
    };
}
