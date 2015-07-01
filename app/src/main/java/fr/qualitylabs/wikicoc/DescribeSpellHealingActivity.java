package fr.qualitylabs.wikicoc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;


public class DescribeSpellHealingActivity extends AppCompatActivity {

    Toolbar toolbar;

    Spell spell = new Spell();

    String[] property = null;

    SeekBar seekBar;

    //    {lvl, radius, heal, buildCost, buildTime, researchCost, researchTime, labRequiered}
    TextView name;
    TextView level;
    TextView radius;
    TextView heal;
    TextView length;
    TextView spellFactoryLvl;
    TextView buildCost;
    TextView buildTime;
    TextView labLvl;
    TextView researchCost;
    TextView researchTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_spell_healing);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        Récupération des vues
        seekBar = (SeekBar) findViewById(R.id.level_seekbar);
        name = (TextView) findViewById(R.id.name);
        level = (TextView) findViewById(R.id.level);
        radius = (TextView) findViewById(R.id.radius);
        heal = (TextView) findViewById(R.id.heal);
        length = (TextView) findViewById(R.id.length);
        spellFactoryLvl = (TextView) findViewById(R.id.spell_factory_level);
        buildCost = (TextView) findViewById(R.id.build_cost);
        buildTime = (TextView) findViewById(R.id.build_time);
        labLvl = (TextView) findViewById(R.id.lab_level_requiered);
        researchCost = (TextView) findViewById(R.id.research_cost);
        researchTime = (TextView) findViewById(R.id.research_time);

//        Récupère les extras
        spell = new HealingSpell();

//        Initialisation des vues avec les données récupérées
        property = spell.getData().get(1);
        //    {lvl, radius, heal, buildCost, buildTime, researchCost, researchTime, labRequiered}

        name.setText(spell.getName());
        length.setText(spell.getLength());
        spellFactoryLvl.setText(spell.getFactoryRequiered());
        level.setText(property[0]);
        radius.setText(property[1]);
        heal.setText(property[2]);
        buildCost.setText(property[3] + " elixir");
        buildTime.setText(property[4]);
        researchCost.setText(property[5] + " elixir");
        researchTime.setText(property[6]);
        labLvl.setText(property[7]);

//        Définition du niveau maximum d'une troupe avec une valeur générique de niveau
        seekBar.setMax(spell.getLevelMax() - 1);
//        Attribution des Listeners
        seekBar.setOnSeekBarChangeListener(seekBarListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_spell_healing, menu);
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
            property = spell.getProperty(progress+1);

            level.setText(property[0]);
            radius.setText(property[1]);
            heal.setText(property[2]);
            buildCost.setText(property[3] + " elixir");
            buildTime.setText(property[4]);
            researchCost.setText(property[5] + " elixir");
            researchTime.setText(property[6]);
            labLvl.setText(property[7]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
