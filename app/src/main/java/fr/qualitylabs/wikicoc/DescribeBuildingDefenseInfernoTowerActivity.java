package fr.qualitylabs.wikicoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;


public class DescribeBuildingDefenseInfernoTowerActivity extends AppCompatActivity {

    Toolbar toolbar;

    Building building = new Building();

    String[] property;

    SeekBar seekBar;

    Switch altswitch;

    ImageView image;
    //    {lvl, dpsInit, dps2+, dps5+, dps/target, hp, costLoad, cost, build time, xp, th requiered}
    TextView name;
    TextView level;
    TextView prefferedtarget;
    TextView targettype;
    TextView attacktype;
    TextView damagepersec;
    TextView damagepersec2;
    TextView damagepersec5;
    TextView damagepersecmulti;
    TextView health;
    TextView costload;
    TextView buildcost;
    TextView buildtime;
    TextView xp;
    TextView levelrequiered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_building_defense_inferno_tower);

        //        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Récupération des vues
        seekBar = (SeekBar) findViewById(R.id.level_seekbar);
        altswitch = (Switch) findViewById(R.id.alt_switch);
        image = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name);
        level = (TextView) findViewById(R.id.level);
        prefferedtarget = (TextView) findViewById(R.id.preffered_target);
        targettype = (TextView) findViewById(R.id.target_type);
        attacktype = (TextView) findViewById(R.id.attack_type);
        damagepersec = (TextView) findViewById(R.id.damage_per_second);
        damagepersec2 = (TextView) findViewById(R.id.damage_per_second_2);
        damagepersec5 = (TextView) findViewById(R.id.damage_per_second_5);
        damagepersecmulti = (TextView) findViewById(R.id.damage_per_second_multitarget);
        costload = (TextView) findViewById(R.id.cost_loading);
        health = (TextView) findViewById(R.id.health);
        buildcost = (TextView) findViewById(R.id.build_cost);
        buildtime = (TextView) findViewById(R.id.build_time);
        xp = (TextView) findViewById(R.id.experience);
        levelrequiered = (TextView) findViewById(R.id.level_requiered);

//        Récupère les extras
        building = (Building) getIntent().getSerializableExtra("building");

//        Initialisation des vues avec les données récupérées
        property = building.getProperty(1);
//    {lvl, dpsInit, dps2+, dps5+, dps/target, hp, costLoad, cost, build time, xp, th requiered}
        name.setText(building.getName());
        image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + building.getNameCode() + 1, null, getPackageName())));
        prefferedtarget.setText(building.getPrefferedTarget());
        targettype.setText(building.getTargetType());
        attacktype.setText(building.getAttackType());
        level.setText(property[0]);
        damagepersec.setText(property[1]);
        damagepersec2.setText(property[2]);
        damagepersec5.setText(property[3]);
        damagepersecmulti.setText(property[4]);
        health.setText(property[5]);
        costload.setText(property[6] + " elixir");
        buildcost.setText(property[7] + " or");
        buildtime.setText(property[8]);
        xp.setText(property[9]);
        levelrequiered.setText(property[10]);

//        Définition du niveau maximum d'une troupe avec une valeur générique de niveau
        seekBar.setMax(building.getLevelMax() - 1);
//        Attribution des Listeners
        seekBar.setOnSeekBarChangeListener(seekBarListener);
        altswitch.setOnCheckedChangeListener(altswitchListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_building_defense_inferno_tower, menu);
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
            altswitch.setChecked(false);
        }

        return super.onOptionsItemSelected(item);
    }

    private SeekBar.OnSeekBarChangeListener seekBarListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            property = building.getProperty(progress+1);

            if (altswitch.isChecked()){
                image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/"+building.getNameCode()+(progress+1)+"alt",null,getPackageName())));
            }
            else {
                image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/"+building.getNameCode()+(progress+1),null,getPackageName())));
            }
            level.setText(property[0]);
            damagepersec.setText(property[1]);
            damagepersec2.setText(property[2]);
            damagepersec5.setText(property[3]);
            damagepersecmulti.setText(property[4]);
            health.setText(property[5]);
            costload.setText(property[6] + " elixir");
            buildcost.setText(property[7] + " or");
            buildtime.setText(property[8]);
            xp.setText(property[9]);
            levelrequiered.setText(property[10]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    private CompoundButton.OnCheckedChangeListener altswitchListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(isChecked){
                image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/"+building.getNameCode()+(property[0])+"alt",null,getPackageName())));
            }
            else{
                image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/"+building.getNameCode()+(property[0]),null,getPackageName())));
            }
        }
    };
}
