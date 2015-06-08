package fr.qualitylabs.wikiclashofclans;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class ChooseTroopBActivity extends ActionBarActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    RelativeLayout barbare;
    RelativeLayout archer;
    RelativeLayout goblin;
    RelativeLayout geant;

    Troop troop = new Troop();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_troop_b);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        barbare = (RelativeLayout) findViewById(R.id.barbare);
        archer = (RelativeLayout) findViewById(R.id.archer);
        goblin = (RelativeLayout) findViewById(R.id.goblin);
        geant = (RelativeLayout) findViewById(R.id.geant);

        barbare.setOnClickListener(barbareListener);
        archer.setOnClickListener(archerListener);
        goblin.setOnClickListener(goblinListener);
        geant.setOnClickListener(geantListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_troop_b, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) { // Si l'item cliqué est le bouton Home, syntaxe particulière de l'ID car c'est un bouton Home "générique"
            NavUtils.navigateUpFromSameTask(this); // Redirige vers le parent (indiqué dans AndroidManifest.xml) de la même application (this)
        }

        return super.onOptionsItemSelected(item);
    }

//    Ouverture de l'activité DescribeTroopActivity pour décrire chaque personnage
    private View.OnClickListener barbareListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "barbare");
            startActivity(intent);

        }
    };

    private View.OnClickListener archerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "archer");
            startActivity(intent);
        }
    };

    private View.OnClickListener goblinListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "goblin");
            startActivity(intent);
        }
    };

    private View.OnClickListener geantListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "geant");
            startActivity(intent);
        }
    };
}
