package fr.qualitylabs.wikicoc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class DescribeBuildingDefenseWallActivity extends ActionBarActivity {

    Toolbar toolbar;

    Building building = new Building();

    String[] property;

    SeekBar seekBar;

    ImageView image;
    //    {lvl, goldCost, totalGoldCost, elixirCost, totalElixiCost, hp, thRequiered}
    TextView name;
    TextView level;
    TextView health;
    TextView costgold;
    TextView costgoldtotal;
    TextView costelixir;
    TextView costelixirtotal;
    TextView levelrequiered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_building_defense_wall);

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
        costgold = (TextView) findViewById(R.id.build_cost_gold);
        costgoldtotal = (TextView) findViewById(R.id.build_cost_gold_total);
        costelixir = (TextView) findViewById(R.id.build_cost_elixir);
        costelixirtotal = (TextView) findViewById(R.id.build_cost_elixir_total);
        health = (TextView) findViewById(R.id.health);
        levelrequiered = (TextView) findViewById(R.id.level_requiered);

//        Récupère les extras
        building = (Building) getIntent().getSerializableExtra("building");

//        Initialisation des vues avec les données récupérées
        property = building.getProperty(1);
        name.setText(building.getName());
        image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + building.getNameCode() + 1, null, getPackageName())));
        level.setText(property[0]);
        costgold.setText(property[1]);
        costgoldtotal.setText(property[2]);
        costelixir.setText(property[3]);
        costelixirtotal.setText(property[4]);
        health.setText(property[5]);
        levelrequiered.setText(property[6]);

//        Définition du niveau maximum d'une troupe avec une valeur générique de niveau
        seekBar.setMax(building.getLevelMax() - 1);
//        Attribution des Listeners
        seekBar.setOnSeekBarChangeListener(seekBarListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_building_defense_wall, menu);
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
            costgold.setText(property[1]);
            costgoldtotal.setText(property[2]);
            costelixir.setText(property[3]);
            costelixirtotal.setText(property[4]);
            health.setText(property[5]);
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
