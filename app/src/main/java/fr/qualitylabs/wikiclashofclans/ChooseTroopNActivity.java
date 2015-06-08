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
    RelativeLayout golem;
    RelativeLayout sorciere;
    RelativeLayout molosse;

    Troop troop = new Troop();

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
        golem = (RelativeLayout) findViewById(R.id.golem);
        sorciere = (RelativeLayout) findViewById(R.id.sorciere);
        molosse = (RelativeLayout) findViewById(R.id.molosse);

        gargouille.setOnClickListener(gargouilleListener);
        chevaucheur.setOnClickListener(chevaucheurListener);
        valkyrie.setOnClickListener(valkyrieListener);
        golem.setOnClickListener(golemListener);
        sorciere.setOnClickListener(sorciereListener);
        molosse.setOnClickListener(molosseListener);
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
            Intent intent = new Intent(getApplicationContext(), DescribeTroopNActivity.class);
            intent.putExtra("key", "gargouille");
            startActivity(intent);
        }
    };

    private View.OnClickListener chevaucheurListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopNActivity.class);
            intent.putExtra("key", "chevaucheur");
            startActivity(intent);
        }
    };

    private View.OnClickListener valkyrieListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopNActivity.class);
            intent.putExtra("key", "valkyrie");
            startActivity(intent);
        }
    };

    private View.OnClickListener golemListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopNActivity.class);
            intent.putExtra("key", "golem");
            startActivity(intent);
        }
    };

    private View.OnClickListener sorciereListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopNActivity.class);
            intent.putExtra("key", "sorciere");
            startActivity(intent);
        }
    };

    private View.OnClickListener molosseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopNActivity.class);
            intent.putExtra("key", "molosse");
            startActivity(intent);
        }
    };
}
