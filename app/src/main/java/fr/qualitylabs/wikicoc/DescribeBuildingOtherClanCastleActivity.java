package fr.qualitylabs.wikicoc;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class DescribeBuildingOtherClanCastleActivity extends AppCompatActivity {

    ClanCastle building;
    Toolbar toolbar;
    String[] property;
    SeekBar seekBar;
    ImageView image;
    //    {lvl, buildCost, hp, troopCapacity, GoldCapactity, ElixirCapacity, DarkElixirCapacity, buildTime, xp, THRequiered}
    TextView name;
    TextView level;
    TextView troop;
    TextView gold;
    TextView elixir;
    TextView darkElixir;
    TextView health;
    TextView buildcost;
    TextView buildtime;
    TextView xp;
    TextView levelrequiered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_building_other_clan_castle);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        seekBar = (SeekBar) findViewById(R.id.level_seekbar);
        image = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name);
        level = (TextView) findViewById(R.id.level);
        troop = (TextView) findViewById(R.id.troop);
        gold = (TextView) findViewById(R.id.gold);
        elixir = (TextView) findViewById(R.id.elixir);
        darkElixir = (TextView) findViewById(R.id.dark_elixir);
        health = (TextView) findViewById(R.id.health);
        buildcost = (TextView) findViewById(R.id.build_cost);
        buildtime = (TextView) findViewById(R.id.build_time);
        xp = (TextView) findViewById(R.id.experience);
        levelrequiered = (TextView) findViewById(R.id.level_requiered);

        building = new ClanCastle();

        property = building.getProperty(1);

        //    {lvl, buildCost, hp, troopCapacity, GoldCapactity, ElixirCapacity, DarkElixirCapacity, buildTime, xp, THRequiered}
        name.setText(building.getName());
        image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), getResources().getIdentifier("@drawable/" + building.getNameCode() + 1, null, getPackageName())));
        level.setText(property[0]);
        buildcost.setText(property[1] + " or");
        health.setText(property[2]);
        troop.setText(property[3]);
        gold.setText(property[4]);
        elixir.setText(property[5]);
        darkElixir.setText(property[6]);
        buildtime.setText(property[7]);
        xp.setText(property[8]);
        levelrequiered.setText(property[9]);

        seekBar.setMax(building.getLevelMax() - 1);

        seekBar.setOnSeekBarChangeListener(seekBarListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_describe_building_other_clan_castle, menu);
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

            image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), getResources().getIdentifier("@drawable/" + building.getNameCode() + (progress + 1), null, getPackageName())));
            level.setText(property[0]);
            buildcost.setText(property[1] + " or");
            health.setText(property[2]);
            troop.setText(property[3]);
            gold.setText(property[4]);
            elixir.setText(property[5]);
            darkElixir.setText(property[6]);
            buildtime.setText(property[7]);
            xp.setText(property[8]);
            levelrequiered.setText(property[9]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
