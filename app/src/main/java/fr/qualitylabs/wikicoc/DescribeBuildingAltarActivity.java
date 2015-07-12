package fr.qualitylabs.wikicoc;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;


public class DescribeBuildingAltarActivity extends ActionBarActivity {

    Toolbar toolbar;

    Building building = new Building();

    String[] property;

    ImageView image;
    //  {lvl, buildCost, buildTime, xp, boost, hp, maxQueue, lvlRequired, unlockedUnit}
    TextView name;
    TextView buildcost;
    TextView buildtime;
    TextView health;
    TextView levelrequired;
    TextView unlockUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_building_altar);

        //On redéfinit la ToolBar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        //Active et rend visible le bouton Home (de la ActionBar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Récuperation des vues
        name = (TextView) findViewById(R.id.name);
        image = (ImageView) findViewById(R.id.image);
        buildcost = (TextView) findViewById(R.id.build_cost);
        buildtime = (TextView) findViewById(R.id.build_time);
        health = (TextView) findViewById(R.id.health);
        levelrequired = (TextView) findViewById(R.id.level_requiered);
        unlockUnit = (TextView) findViewById(R.id.unlock_unit);

        //Récupère les extras
        building = (Building) getIntent().getSerializableExtra("building");

        //Initialisation des vues avec les données récupérées
        property = building.getProperty(1);

        name.setText(building.getName());
        image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + building.getNameCode(), null, getPackageName())));
        buildcost.setText(property[0] + " elixir noir");
        buildtime.setText(property[1]);
        health.setText(property[2]);
        unlockUnit.setText(property[3]);
        levelrequired.setText(property[4]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_building_altar, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.reset) {
//            seekBar.setProgress(0);
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}