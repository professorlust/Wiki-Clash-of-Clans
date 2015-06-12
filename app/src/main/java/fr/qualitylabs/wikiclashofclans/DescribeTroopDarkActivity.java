package fr.qualitylabs.wikiclashofclans;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class DescribeTroopDarkActivity extends ActionBarActivity {

    Toolbar toolbar;

    Troop troop = new Troop();

    String[] property;

    SeekBar seekBar;

    ImageView image;

    TextView name;
    TextView housingspace;
    TextView prefferedtarget;
    TextView targettype;
    TextView attacktype;
    TextView level;
    TextView trainingtime;
    TextView speed;
    TextView damage;
    TextView health;
    TextView trainingcost;
    TextView researchcost;
    TextView requiredlevel;
    TextView researchtime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_troop_dark);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Récupération des vues
        seekBar = (SeekBar) findViewById(R.id.level_seekbar);
        image = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name);
        housingspace = (TextView) findViewById(R.id.housing_space);
        prefferedtarget = (TextView) findViewById(R.id.preffered_target);
        targettype = (TextView) findViewById(R.id.target_type);
        attacktype = (TextView) findViewById(R.id.attack_type);
        level = (TextView) findViewById(R.id.level);
        trainingtime = (TextView) findViewById(R.id.training_time);
        speed = (TextView) findViewById(R.id.speed);
        damage = (TextView) findViewById(R.id.damage);
        health = (TextView) findViewById(R.id.health);
        trainingcost = (TextView) findViewById(R.id.training_cost);
        researchcost = (TextView) findViewById(R.id.research_cost);
        requiredlevel = (TextView) findViewById(R.id.requiered_level);
        researchtime = (TextView) findViewById(R.id.research_time);

//        Récupère les extras
        troop = (Troop) getIntent().getSerializableExtra("troop");

//        Initialisation des vues avec les données récupérées
//    {niveau, duréeFormation, vitesse, dégatsParSeconde, pointsVie, coutFormation, coutRecherche, nibveauRequis, tempsRecherche}
        property = troop.getProperty(1);

        image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/"+troop.getNamecode()+1,null,getPackageName())));
        name.setText(troop.getName());
        housingspace.setText(troop.getHousingSpace());
        prefferedtarget.setText(troop.getPrefferedTarget());
        targettype.setText(troop.getTargetType());
        attacktype.setText(troop.getAttackType());
        level.setText(property[0]);
        trainingtime.setText(property[1]);
        speed.setText(property[2]);
        damage.setText(property[3]);
        health.setText(property[4]);
        trainingcost.setText(property[5]+" elixir noir");
        researchcost.setText(property[6]);
        requiredlevel.setText(property[7]);
        researchtime.setText(property[8]);

//        Définition du niveau maximum d'une troupe avec une valeur générique de niveau
        seekBar.setMax(troop.getLevelMax() - 1);
//        Attribution des Listeners
        seekBar.setOnSeekBarChangeListener(seekBarListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_troop_dark, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.reset) {
            seekBar.setProgress(0);
        }

        return super.onOptionsItemSelected(item);
    }

    private SeekBar.OnSeekBarChangeListener seekBarListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            property = troop.getProperty(progress+1);

            image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/"+troop.getNamecode()+(progress+1),null,getPackageName())));
            level.setText(property[0]);
            trainingtime.setText(property[1]);
            speed.setText(property[2]);
            damage.setText(property[3]);
            health.setText(property[4]);
            trainingcost.setText(property[5]+" elixir noir");
            researchcost.setText(property[6]);
            requiredlevel.setText(property[7]);
            researchtime.setText(property[8]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
