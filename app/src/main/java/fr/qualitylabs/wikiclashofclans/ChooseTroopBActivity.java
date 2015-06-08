package fr.qualitylabs.wikiclashofclans;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class ChooseTroopBActivity extends ActionBarActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    CardView barbare;
    CardView archer;
    CardView gobelin;
    CardView geant;
    CardView sapeur;
    CardView ballon;
    CardView sorcier;
    CardView guerisseuse;
    CardView dragon;
    CardView pekka;

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

        barbare = (CardView) findViewById(R.id.barbare);
        archer = (CardView) findViewById(R.id.archer);
        gobelin = (CardView) findViewById(R.id.gobelin);
        geant = (CardView) findViewById(R.id.geant);
        sapeur = (CardView) findViewById(R.id.sapeur);
        ballon = (CardView) findViewById(R.id.ballon);
        sorcier = (CardView) findViewById(R.id.sorcier);
        guerisseuse = (CardView) findViewById(R.id.guerisseuse);
        dragon = (CardView) findViewById(R.id.dragon);
        pekka = (CardView) findViewById(R.id.pekka);

        barbare.setOnClickListener(barbareListener);
        archer.setOnClickListener(archerListener);
        gobelin.setOnClickListener(gobelinListener);
        geant.setOnClickListener(geantListener);
        sapeur.setOnClickListener(sapeurListener);
        ballon.setOnClickListener(ballonListener);
        sorcier.setOnClickListener(sorcierListener);
        guerisseuse.setOnClickListener(guerisseuseListener);
        dragon.setOnClickListener(dragonListener);
        pekka.setOnClickListener(pekkaListener);
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

    private View.OnClickListener gobelinListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "gobelin");
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

    private View.OnClickListener sapeurListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "sapeur");
            startActivity(intent);
        }
    };

    private View.OnClickListener ballonListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "ballon");
            startActivity(intent);
        }
    };

    private View.OnClickListener sorcierListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "sorcier");
            startActivity(intent);
        }
    };

    private View.OnClickListener guerisseuseListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "guerisseuse");
            startActivity(intent);
        }
    };

    private View.OnClickListener dragonListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "dragon");
            startActivity(intent);
        }
    };

    private View.OnClickListener pekkaListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "pekka");
            startActivity(intent);
        }
    };
}
