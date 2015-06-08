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

//    nom, niveau, ciblesPréférées, typeCibles, typeDégats, espaceOccupé, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche
    TextView nom;
    TextView niveau;
    TextView ciblesPref;
    TextView typeCible;
    TextView typeDeg;
    TextView espaceOccupe;
    TextView dureeForm;
    TextView vitesse;
    TextView degats;
    TextView vie;
    TextView coutForm;
    TextView coutRech;
    TextView niveauReq;
    TextView tempsRech;

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
        ciblesPref = (TextView) findViewById(R.id.describe_troop_b_cibles_pref);
        typeCible = (TextView) findViewById(R.id.describe_troop_b_type_cibles);
        typeDeg = (TextView) findViewById(R.id.describe_troop_b_type_degat);
        espaceOccupe = (TextView) findViewById(R.id.describe_troop_b_type_espace_occupe);
        dureeForm = (TextView) findViewById(R.id.describe_troop_b_duree_formation);
        vitesse = (TextView) findViewById(R.id.describe_troop_b_vitesse);
        vie = (TextView) findViewById(R.id.describe_troop_b_vie);
        coutForm = (TextView) findViewById(R.id.describe_b_cout_formation);
        coutRech = (TextView) findViewById(R.id.describe_troop_b_cout_recherche);
        niveauReq = (TextView) findViewById(R.id.describe_troop_b_niveau_requis);
        tempsRech = (TextView) findViewById(R.id.describe_troop_b_temps_recherche);
        degats = (TextView) findViewById(R.id.describe_troop_b_degats);

//        Récupère les extras
        data= getIntent().getStringExtra("key");

//        Initialisation des vues avec les données récupérées
        troopinit = troop.calculerStatistiques(data, 1);
        nom.setText(troopinit[0]);
        niveau.setText("Niveau: " + troopinit[1]);
        ciblesPref.setText("Cibles préférées: " + troopinit[2]);
        typeCible.setText("Type de cible: " + troopinit[3]);
        typeDeg.setText("Type de dégats: " + troopinit[4]);
        espaceOccupe.setText("Espace occupé: " + troopinit[5]);
        dureeForm.setText("Durée de formation: " + troopinit[6]);
        vitesse.setText("Vitesse: " + troopinit[7]);
        degats.setText("Dégats par seconde: " + troopinit[8]);
        vie.setText("Vie: " + troopinit[9]);
        coutForm.setText("Coût de formation: " + troopinit[10]);
        coutRech.setText("Coût de recherche: " + troopinit[11]);
        niveauReq.setText("Niveau requis: " + troopinit[12]);
        tempsRech.setText("Temps de recherche: " + troopinit[13]);

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
            niveau.setText("Niveau: " + current[1]);
            ciblesPref.setText("Cibles préférées: " + current[2]);
            typeCible.setText("Type de cible: " + current[3]);
            typeDeg.setText("Type de dégats: " + current[4]);
            espaceOccupe.setText("Espace occupé: " + current[5]);
            dureeForm.setText("Durée de formation: " + current[6]);
            vitesse.setText("Vitesse: " + current[7]);
            degats.setText("Dégats par seconde: " + current[8]);
            vie.setText("Vie: " + current[9]);
            coutForm.setText("Coût de formation: " + current[10]);
            coutRech.setText("Coût de recherche: " + current[11]);
            niveauReq.setText("Niveau requis: " + current[12]);
            tempsRech.setText("Temps de recherche: " + current[13]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
