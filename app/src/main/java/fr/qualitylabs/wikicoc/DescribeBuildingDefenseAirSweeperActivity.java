package fr.qualitylabs.wikicoc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class DescribeBuildingDefenseAirSweeperActivity extends ActionBarActivity {

    Toolbar toolbar;

    Building building = new Building();

    String[] property;

    SeekBar seekBar;

    ImageView image;
    //    <!--{lvl, stregth, hp, cost, build time, xp, th requiered}-->
    TextView name;
    TextView level;
    TextView strength;
    TextView health;
    TextView buildcost;
    TextView buildtime;
    TextView xp;
    TextView levelrequiered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_building_defense_air_sweeper);

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
        level = (TextView) findViewById(R.id.level);
        strength = (TextView) findViewById(R.id.strength);
        health = (TextView) findViewById(R.id.health);
        buildcost = (TextView) findViewById(R.id.build_cost);
        buildtime = (TextView) findViewById(R.id.build_time);
        xp = (TextView) findViewById(R.id.experience);
        levelrequiered = (TextView) findViewById(R.id.level_requiered);

//        Récupère les extras
        building = (Building) getIntent().getSerializableExtra("building");

//        Initialisation des vues avec les données récupérées
        property = building.getProperty(1);

        name.setText(building.getName());
        image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + building.getNameCode() + 1, null, getPackageName())));
        level.setText(property[0]);
        strength.setText(property[1]);
        health.setText(property[2]);
        buildcost.setText(property[3]);
        buildtime.setText(property[4]);
        xp.setText(property[5]);
        levelrequiered.setText(property[6]);

//        Définition du niveau maximum d'une troupe avec une valeur générique de niveau
        seekBar.setMax(building.getLevelMax() - 1);
//        Attribution des Listeners
        seekBar.setOnSeekBarChangeListener(seekBarListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_building_defense_air_sweeper, menu);
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
            property = building.getProperty(progress+1);

            image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + building.getNameCode() + (progress + 1), null, getPackageName())));
            level.setText(property[0]);
            strength.setText(property[1]);
            health.setText(property[2]);
            buildcost.setText(property[3]);
            buildtime.setText(property[4]);
            xp.setText(property[5]);
            levelrequiered.setText(property[6]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
