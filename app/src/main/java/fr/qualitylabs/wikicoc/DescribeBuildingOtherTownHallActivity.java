package fr.qualitylabs.wikicoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class DescribeBuildingOtherTownHallActivity extends AppCompatActivity {

    TownHall building;

    Toolbar toolbar;
    ImageView image;
    TextView level;
    TextView hp;
    TextView buildCost;
    TextView buildTime;
    TextView xp;
    SeekBar seekBar;
    TextView numberDarkBarack;
    TextView numberBarrack;
    TextView numberArmyCamp;
    TextView numberLab;
    TextView numberSpellFactory;
    TextView numberDarkSpellFactory;
    TextView numberBarbarianKingAltar;
    TextView numberArcherQueenAltar;

    String[] property;
    String[] maxNumberArmy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_building_other_town_hall);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        image = (ImageView) findViewById(R.id.image);
        level = (TextView) findViewById(R.id.level);
        hp = (TextView) findViewById(R.id.health);
        buildCost = (TextView) findViewById(R.id.build_cost);
        buildTime = (TextView) findViewById(R.id.build_time);
        xp = (TextView) findViewById(R.id.experience);
        seekBar = (SeekBar) findViewById(R.id.level_seekbar);
        numberDarkBarack = (TextView) findViewById(R.id.max_number_dark_barrack);
        numberBarrack = (TextView) findViewById(R.id.max_number_barrack);
        numberArmyCamp = (TextView) findViewById(R.id.max_number_army_camp);
        numberLab = (TextView) findViewById(R.id.max_number_lab);
        numberSpellFactory = (TextView) findViewById(R.id.max_number_spell_factory);
        numberDarkSpellFactory = (TextView) findViewById(R.id.max_number_dark_spell_factory);
        numberBarbarianKingAltar = (TextView) findViewById(R.id.max_number_barbarian_king_altar);
        numberArcherQueenAltar = (TextView) findViewById(R.id.max_number_archer_queen_altar);

        seekBar.setOnSeekBarChangeListener(seekBarListener);

        building = new TownHall();

        seekBar.setMax(building.getLevelMax() - 1);

        property = building.getProperty(1);
        maxNumberArmy = building.getNumberOfArmyBuildings(1);

        //{lvl, hp, buildCost, buildTime, xp, maxBuildingsNumber}
        image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/"+building.getNameCode()+1,null,getPackageName())));
        level.setText(property[0]);
        hp.setText(property[1]);
        buildCost.setText(property[2]);
        buildTime.setText(property[3]);
        xp.setText(property[4]);
        numberDarkBarack.setText(maxNumberArmy[0]);
        numberBarrack.setText(maxNumberArmy[1]);
        numberArmyCamp.setText(maxNumberArmy[2]);
        numberLab.setText(maxNumberArmy[3]);
        numberSpellFactory.setText(maxNumberArmy[4]);
        numberDarkSpellFactory.setText(maxNumberArmy[5]);
        numberBarbarianKingAltar.setText(maxNumberArmy[6]);
        numberArcherQueenAltar.setText(maxNumberArmy[7]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_building_other_town_hall, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private SeekBar.OnSeekBarChangeListener seekBarListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            property = building.getProperty(progress+1);

            image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/"+building.getNameCode()+(progress+1),null,getPackageName())));
            level.setText(property[0]);
            hp.setText(property[1]);
            buildCost.setText(property[2]);
            buildTime.setText(property[3]);
            xp.setText(property[4]);
            numberDarkBarack.setText(maxNumberArmy[0]);
            numberBarrack.setText(maxNumberArmy[1]);
            numberArmyCamp.setText(maxNumberArmy[2]);
            numberLab.setText(maxNumberArmy[3]);
            numberSpellFactory.setText(maxNumberArmy[4]);
            numberDarkSpellFactory.setText(maxNumberArmy[5]);
            numberBarbarianKingAltar.setText(maxNumberArmy[6]);
            numberArcherQueenAltar.setText(maxNumberArmy[7]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
