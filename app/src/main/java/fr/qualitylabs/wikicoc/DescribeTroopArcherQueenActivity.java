package fr.qualitylabs.wikicoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class DescribeTroopArcherQueenActivity extends AppCompatActivity {

    Toolbar toolbar;

    ArcherQueen troop = new ArcherQueen();
    //    {lvl, damages/s, damages/hit, hp, regenerationTime, abilityLvl, researchCost, researchTime, lvlRequiered}
    String[] property;
    String[] ability;

    SeekBar seekBar;
    SeekBar seekBarAbility;

    ImageView image;

    TextView name;
    TextView prefferedtarget;
    TextView targettype;
    TextView attacktype;
    TextView level;
    TextView speed;
    TextView damage;
    TextView damagePerShot;
    TextView health;
    TextView regenerationTime;
    TextView abilityLevel;
    TextView researchcost;
    TextView requiredlevel;
    TextView researchtime;
    //    {lvl, damages+, hp+,, unitsCreated, time}
    TextView abilityLvl;
    TextView abilityDamage;
    TextView abilityHp;
    TextView abilityUnits;
    TextView abilityTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_troop_archer_queen);

        //        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Récupération des vues
        seekBar = (SeekBar) findViewById(R.id.level_seekbar);
        seekBarAbility = (SeekBar) findViewById(R.id.ability_level_seekbar);
        image = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name);
        prefferedtarget = (TextView) findViewById(R.id.preffered_target);
        targettype = (TextView) findViewById(R.id.target_type);
        attacktype = (TextView) findViewById(R.id.attack_type);
        level = (TextView) findViewById(R.id.level);
        speed = (TextView) findViewById(R.id.speed);
        damage = (TextView) findViewById(R.id.damage);
        damagePerShot = (TextView) findViewById(R.id.damage_per_shot);
        health = (TextView) findViewById(R.id.health);
        regenerationTime = (TextView) findViewById(R.id.regeneration_time);
        abilityLevel = (TextView) findViewById(R.id.ability_level);
        researchcost = (TextView) findViewById(R.id.research_cost);
        requiredlevel = (TextView) findViewById(R.id.requiered_level);
        researchtime = (TextView) findViewById(R.id.research_time);

        abilityLvl = (TextView) findViewById(R.id.ability_lvl);
        abilityDamage = (TextView) findViewById(R.id.ability_damages);
        abilityHp = (TextView) findViewById(R.id.ability_hp);
        abilityUnits = (TextView) findViewById(R.id.ability_units);
        abilityTime = (TextView) findViewById(R.id.ability_time);

//        Récupère les extras
        troop = (ArcherQueen) getIntent().getSerializableExtra("troop");

//        Initialisation des vues avec les données récupérées
//    {lvl, damages/s, damages/hit, hp, regenerationTime, abilityLvl, researchCost, researchTime, lvlRequiered}
//    {lvl, damages+, hp+, speed+, unitsCreated, time}
        property = troop.getProperty(1);
        ability = troop.getAbility(1);
//
        image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + troop.getNamecode() + 1, null, getPackageName())));
        name.setText(troop.getName());
        prefferedtarget.setText(troop.getPrefferedTarget());
        targettype.setText(troop.getTargetType());
        attacktype.setText(troop.getAttackType());
        speed.setText(troop.getSpeed());
        level.setText(property[0]);
        damage.setText(property[1]);
        damagePerShot.setText(property[2]);
        health.setText(property[3]);
        regenerationTime.setText(property[4]);
        abilityLevel.setText(property[5]);
        researchcost.setText(property[6] + " elixir noir");
        researchtime.setText(property[7]);
        requiredlevel.setText(property[8]);

        abilityLvl.setText(ability[0]);
        abilityDamage.setText(ability[1]);
        abilityHp.setText(ability[2]);
        abilityUnits.setText(ability[3]);
        abilityTime.setText(ability[4]);


//        Définition du niveau maximum d'une troupe avec une valeur générique de niveau
        seekBar.setMax(troop.getLevelMax() - 1);
//        Attribution des Listeners
        seekBar.setOnSeekBarChangeListener(seekBarListener);

        seekBarAbility.setMax(troop.getAbilityMax() -1);
        seekBarAbility.setOnSeekBarChangeListener(seekBarAbilityListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_troop_archer_queen, menu);
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
            seekBarAbility.setProgress(0);
        }

        return super.onOptionsItemSelected(item);
    }

    private SeekBar.OnSeekBarChangeListener seekBarListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            property = troop.getProperty(progress+1);

            if(Integer.valueOf(property[0])<10){image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + troop.getNamecode() + 1, null, getPackageName())));}
            if(Integer.valueOf(property[0])>9 && Integer.valueOf(property[0])<20){image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + troop.getNamecode() + 10, null, getPackageName())));}
            if(Integer.valueOf(property[0])>19){image.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("@drawable/" + troop.getNamecode() + 20, null, getPackageName())));}
            level.setText(property[0]);
            damage.setText(property[1]);
            damagePerShot.setText(property[2]);
            health.setText(property[3]);
            regenerationTime.setText(property[4]);
            abilityLevel.setText(property[5]);
            researchcost.setText(property[6] + " elixir noir");
            researchtime.setText(property[7]);
            requiredlevel.setText(property[8]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    private SeekBar.OnSeekBarChangeListener seekBarAbilityListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            ability = troop.getAbility(progress+1);

            abilityLvl.setText(ability[0]);
            abilityDamage.setText(ability[1]);
            abilityHp.setText(ability[2]);
            abilityUnits.setText(ability[3]);
            abilityTime.setText(ability[4]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
