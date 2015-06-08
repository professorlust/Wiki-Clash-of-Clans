package fr.qualitylabs.wikiclashofclans;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class DescribeTroopBActivity extends ActionBarActivity {

    Toolbar toolbar;
    SeekBar seekBar;
    Troop troop = new Troop();
    String data;
    String[] troopinit;

    TextView nom;
    TextView niveau;
    TextView degats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_troop_b);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Récupération des vues
        seekBar = (SeekBar) findViewById(R.id.describe_troop_b_seek_bar);
        nom = (TextView) findViewById(R.id.describe_troop_b_nom);
        niveau = (TextView) findViewById(R.id.describe_troop_b_niveau);
        degats = (TextView) findViewById(R.id.describe_troop_b_degats);

//        Récupère les extras
        data= getIntent().getStringExtra("key");

//        Initialisation des vues avec les données récupérées
        troopinit = troop.calculerStatistiques(data, 1);
        nom.setText(troopinit[0]);
        niveau.setText(troopinit[1]);
        degats.setText(troopinit[8]);

//        Définition du niveau maximum d'une troupe avec une valeur générique de niveau
        String[] current = troop.calculerStatistiques(data, 1);
        seekBar.setMax(troop.getMax(current[0]));

//        Attribution des Listeners
        seekBar.setOnSeekBarChangeListener(seekBarListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_troop_b, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private SeekBar.OnSeekBarChangeListener seekBarListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//    Modèle du String[]: {nom, niveau, ciblesPréférées, typeCibles, typeDégats, espaceOccupé, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
            String[] current = troop.calculerStatistiques(data, progress + 1);
            nom.setText(current[0]);
            niveau.setText(current[1]);
            degats.setText(current[8]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
