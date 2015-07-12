package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class ChooseTroopDarkActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    CardView minion;
    CardView hogrider;
    CardView valkyrie;
    CardView golem;
    CardView witch;
    CardView lavahound;

    Troop troop = new Troop();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_troop_dark);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        minion = (CardView) findViewById(R.id.minion);
        hogrider = (CardView) findViewById(R.id.hogrider);
        valkyrie = (CardView) findViewById(R.id.valkyrie);
        golem = (CardView) findViewById(R.id.golem);
        witch = (CardView) findViewById(R.id.witch);
        lavahound = (CardView) findViewById(R.id.lavahound);

        minion.setOnClickListener(minionListener);
        hogrider.setOnClickListener(hogriderListener);
        valkyrie.setOnClickListener(valkyrieListener);
        golem.setOnClickListener(golemListener);
        witch.setOnClickListener(witchListener);
        lavahound.setOnClickListener(lavahoundListener);
    }

    private View.OnClickListener minionListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopDarkActivity.class);
            troop = new Minion();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener hogriderListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopDarkActivity.class);
            troop = new HogRider();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener valkyrieListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopDarkActivity.class);
            troop = new Valkyrie();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener golemListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopDarkActivity.class);
            troop = new Golem();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener witchListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopDarkActivity.class);
            troop = new Witch();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener lavahoundListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopDarkActivity.class);
            troop = new LavaHound();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };
}
