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


public class ChooseTroopNActivity extends ActionBarActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    RelativeLayout gargouille;
    RelativeLayout chevaucheur;
    RelativeLayout valkyrie;

    TroopN troopN = new TroopN();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_troop_n);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gargouille = (RelativeLayout) findViewById(R.id.gargouille);
        chevaucheur = (RelativeLayout) findViewById(R.id.chevaucheur);
        valkyrie = (RelativeLayout) findViewById(R.id.valkyrie);

        gargouille.setOnClickListener(gargouilleListener);
        chevaucheur.setOnClickListener(chevaucheurListener);
        valkyrie.setOnClickListener(valkyrieListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_troop_n, menu);
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

    private View.OnClickListener gargouilleListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String test = troopN.calculerStatistiques("gargouille", 1)[9];
            Toast.makeText(getApplicationContext(), test, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), DescribeTroopNActivity.class));
        }
    };

    private View.OnClickListener chevaucheurListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String test = troopN.calculerStatistiques("gargouille", 2)[9];
            Toast.makeText(getApplicationContext(), test, Toast.LENGTH_SHORT).show();
        }
    };

    private View.OnClickListener valkyrieListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String test = troopN.calculerStatistiques("gargouille", 3)[9];
            Toast.makeText(getApplicationContext(), test, Toast.LENGTH_SHORT).show();
        }
    };
}