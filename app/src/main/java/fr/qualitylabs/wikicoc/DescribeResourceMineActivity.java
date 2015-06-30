package fr.qualitylabs.wikicoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Alex on 30/06/2015.
 */
public class DescribeResourceMineActivity extends AppCompatActivity{

    Toolbar toolbar;

    Building building = new Building();

    String[] property;

    SeekBar seekBar;

    ImageView image;

    // {lvl, buildCost, buildTime, xp, boost, capacity, prodRate, hp, fillTime, lvlRequired}
    TextView name;
    TextView level;
    TextView buildcost;
    TextView buildtime;
    TextView xp;
    TextView boost;
    TextView capacity;
    TextView prodrate;
    TextView health;
    TextView filltime;
    TextView levelrequired;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_resource_mine);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Récuperation des vues
        seekBar = (SeekBar) findViewById(R.id.level_seekbar);
        image = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name);
        level = (TextView) findViewById(R.id.level);
        buildcost = (TextView) findViewById(R.id.build_cost);
        buildtime = (TextView) findViewById(R.id.build_time);
        xp = (TextView) findViewById(R.id.experience);
        boost = (TextView) findViewById(R.id.boost);
        capacity = (TextView) findViewById(R.id.capacity);
        prodrate = (TextView) findViewById(R.id.prodrate);
        health = (TextView) findViewById(R.id.health);
        filltime = (TextView) findViewById(R.id.filltime);
        levelrequired = (TextView) findViewById(R.id.level_requiered);

        //Récupère les extras
        building = (Building) getIntent().getSerializableExtra("building");

        //Initialisation des vues avec les données récupérées
        property = building.getProperty(1);

        name.setText(building.getName());
        image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + building.getNameCode() + 1, null, getPackageName())));
        level.setText(property[0]);
        buildcost.setText(property[1]);
        buildtime.setText(property[2]);
        xp.setText(property[3]);
        boost.setText(property[4] + " gemmes");
        capacity.setText(property[5]);
        prodrate.setText(property[6] + " or");
        health.setText(property[7]);
        filltime.setText(property[8]);
        levelrequired.setText(property[9]);

        //Définition du niveau maximum d'un batiment avec une valeur générique de niveau
        seekBar.setMax(building.getLevelMax() - 1);
        //Attribution du Listener
        seekBar.setOnSeekBarChangeListener(seekBarListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_resource_mine, menu);
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

    private SeekBar.OnSeekBarChangeListener seekBarListener = new SeekBar.OnSeekBarChangeListener(){
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){

            image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + building.getNameCode() + 1, null, getPackageName())));
            level.setText(property[0]);
            buildcost.setText(property[1]);
            buildtime.setText(property[2]);
            xp.setText(property[3]);
            boost.setText(property[4] + " gemmes");
            capacity.setText(property[5]);
            prodrate.setText(property[6] + " or");
            health.setText(property[7]);
            filltime.setText(property[8]);
            levelrequired.setText(property[9]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
