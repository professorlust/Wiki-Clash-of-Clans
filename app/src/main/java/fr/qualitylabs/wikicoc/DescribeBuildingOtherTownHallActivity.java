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


public class DescribeBuildingOtherTownHallActivity extends AppCompatActivity {

    TownHall building;

    Toolbar toolbar;
    ImageView image;
    TextView name;
    TextView level;
    TextView hp;
    TextView buildCost;
    TextView buildTime;
    TextView xp;
    SeekBar seekBar;
//    ------
    TextView numberDarkBarack;
    TextView numberBarrack;
    TextView numberArmyCamp;
    TextView numberLab;
    TextView numberSpellFactory;
    TextView numberDarkSpellFactory;
    TextView numberBarbarianKingAltar;
    TextView numberArcherQueenAltar;
    TextView numberClanCastle;
    TextView levelDarkBarack;
    TextView levelBarrack;
    TextView levelArmyCamp;
    TextView levelLab;
    TextView levelSpellFactory;
    TextView levelDarkSpellFactory;
    TextView levelBarbarianKingAltar;
    TextView levelArcherQueenAltar;
    TextView levelClanCastle;
//    ------
    TextView numberGoldMine;
    TextView numberElixirCollector;
    TextView numberDarkElixirDrill;
    TextView numberGoldStorage;
    TextView numberElixirStorage;
    TextView numberDarkElixirStorage;
    TextView levelGoldMine;
    TextView levelElixirCollector;
    TextView levelDarkElixirDrill;
    TextView levelGoldStorage;
    TextView levelElixirStorage;
    TextView levelDarkElixirStorage;
//    ------
    TextView numberCannon;
    TextView numberArcherTower;
    TextView numberWall;
    TextView numberMortar;
    TextView numberBomb;
    TextView numberAirDefense;
    TextView numberAirSweeper;
    TextView numberSpring;
    TextView numberWizardTower;
    TextView numberGiantBomb;
    TextView numberAirBomb;
    TextView numberSeekingAirMine;
    TextView numberSkeleton;
    TextView numberHiddenTesla;
    TextView numberXBow;
    TextView numberInfernoTower;
    TextView levelCannon;
    TextView levelArcherTower;
    TextView levelWall;
    TextView levelMortar;
    TextView levelBomb;
    TextView levelAirDefense;
    TextView levelAirSweeper;
    TextView levelSpring;
    TextView levelWizardTower;
    TextView levelGiantBomb;
    TextView levelAirBomb;
    TextView levelSeekingAirMine;
    TextView levelSkeleton;
    TextView levelHiddenTesla;
    TextView levelXBow;
    TextView levelInfernoTower;

    String[] property;
    String[] maxNumberArmy;
    String[] maxLevelArmy;
    String[] maxNumberResource;
    String[] maxLevelResource;
    String[] maxNumberDefense;
    String[] maxLevelDefense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe_building_other_town_hall);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        building = new TownHall();

        property = building.getProperty(1);
        maxNumberArmy = building.getNumberOfArmyBuildings(1);
        maxLevelArmy = building.getLevelOfArmyBuildings(1);
        maxNumberResource = building.getNumberOfResourceBuildings(1);
        maxLevelResource = building.getLevelOfResourceBuildings(1);
        maxNumberDefense = building.getNumberOfDefenseBuildings(1);
        maxLevelDefense = building.getLevelOfDefenseBuildings(1);

        image = (ImageView) findViewById(R.id.image);
        name = (TextView) findViewById(R.id.name);
        level = (TextView) findViewById(R.id.level);
        hp = (TextView) findViewById(R.id.health);
        buildCost = (TextView) findViewById(R.id.build_cost);
        buildTime = (TextView) findViewById(R.id.build_time);
        xp = (TextView) findViewById(R.id.experience);
        seekBar = (SeekBar) findViewById(R.id.level_seekbar);
//        ------
        numberDarkBarack = (TextView) findViewById(R.id.max_number_dark_barrack);
        numberBarrack = (TextView) findViewById(R.id.max_number_barrack);
        numberArmyCamp = (TextView) findViewById(R.id.max_number_army_camp);
        numberLab = (TextView) findViewById(R.id.max_number_lab);
        numberSpellFactory = (TextView) findViewById(R.id.max_number_spell_factory);
        numberDarkSpellFactory = (TextView) findViewById(R.id.max_number_dark_spell_factory);
        numberBarbarianKingAltar = (TextView) findViewById(R.id.max_number_barbarian_king_altar);
        numberArcherQueenAltar = (TextView) findViewById(R.id.max_number_archer_queen_altar);
        numberClanCastle = (TextView) findViewById(R.id.max_number_clan_castle);
        levelDarkBarack = (TextView) findViewById(R.id.max_level_dark_barrack);
        levelBarrack = (TextView) findViewById(R.id.max_level_barrack);
        levelArmyCamp = (TextView) findViewById(R.id.max_level_army_camp);
        levelLab = (TextView) findViewById(R.id.max_level_lab);
        levelSpellFactory = (TextView) findViewById(R.id.max_level_spell_factory);
        levelDarkSpellFactory = (TextView) findViewById(R.id.max_level_dark_spell_factory);
        levelBarbarianKingAltar = (TextView) findViewById(R.id.max_level_barbarian_king_altar);
        levelArcherQueenAltar = (TextView) findViewById(R.id.max_level_archer_queen_altar);
        levelClanCastle = (TextView) findViewById(R.id.max_level_clan_castle);
//        ------
        numberGoldMine = (TextView) findViewById(R.id.max_number_gold_mine);
        numberElixirCollector = (TextView) findViewById(R.id.max_number_elixir_collector);
        numberDarkElixirDrill = (TextView) findViewById(R.id.max_number_dark_elixir_drill);
        numberGoldStorage = (TextView) findViewById(R.id.max_number_gold_storage);
        numberElixirStorage = (TextView) findViewById(R.id.max_number_elixir_storage);
        numberDarkElixirStorage = (TextView) findViewById(R.id.max_number_dark_elixir_storage);
        levelGoldMine = (TextView) findViewById(R.id.max_level_gold_mine);
        levelElixirCollector = (TextView) findViewById(R.id.max_level_elixir_collector);
        levelDarkElixirDrill = (TextView) findViewById(R.id.max_level_dark_elixir_drill);
        levelGoldStorage = (TextView) findViewById(R.id.max_level_gold_storage);
        levelElixirStorage = (TextView) findViewById(R.id.max_level_elixir_storage);
        levelDarkElixirStorage = (TextView) findViewById(R.id.max_level_dark_elixir_storage);
//        ------
        numberCannon = (TextView) findViewById(R.id.max_number_cannon);
        numberArcherTower = (TextView) findViewById(R.id.max_number_archer_tower);
        numberWall = (TextView) findViewById(R.id.max_number_wall);
        numberMortar = (TextView) findViewById(R.id.max_number_mortar);
        numberBomb = (TextView) findViewById(R.id.max_number_bomb);
        numberAirDefense = (TextView) findViewById(R.id.max_number_air_defense);
        numberAirSweeper = (TextView) findViewById(R.id.max_number_air_sweeper);
        numberSpring = (TextView) findViewById(R.id.max_number_spring);
        numberWizardTower = (TextView) findViewById(R.id.max_number_wizard_tower);
        numberGiantBomb = (TextView) findViewById(R.id.max_number_giant_bomb);
        numberAirBomb = (TextView) findViewById(R.id.max_number_air_bomb);
        numberSeekingAirMine = (TextView) findViewById(R.id.max_number_seeking_air_mine);
        numberSkeleton = (TextView) findViewById(R.id.max_number_skeleton);
        numberHiddenTesla = (TextView) findViewById(R.id.max_number_hidden_tesla);
        numberXBow = (TextView) findViewById(R.id.max_number_x_bow);
        numberInfernoTower = (TextView) findViewById(R.id.max_number_inferno_tower);
        levelCannon = (TextView) findViewById(R.id.max_level_cannon);
        levelArcherTower = (TextView) findViewById(R.id.max_level_archer_tower);
        levelWall = (TextView) findViewById(R.id.max_level_wall);
        levelMortar = (TextView) findViewById(R.id.max_level_mortar);
        levelBomb = (TextView) findViewById(R.id.max_level_bomb);
        levelAirDefense = (TextView) findViewById(R.id.max_level_air_defense);
        levelAirSweeper = (TextView) findViewById(R.id.max_level_air_sweeper);
        levelSpring = (TextView) findViewById(R.id.max_level_spring);
        levelWizardTower = (TextView) findViewById(R.id.max_level_wizard_tower);
        levelGiantBomb = (TextView) findViewById(R.id.max_level_giant_bomb);
        levelAirBomb = (TextView) findViewById(R.id.max_level_air_bomb);
        levelSeekingAirMine = (TextView) findViewById(R.id.max_level_seeking_air_mine);
        levelSkeleton = (TextView) findViewById(R.id.max_level_skeleton);
        levelHiddenTesla = (TextView) findViewById(R.id.max_level_hidden_tesla);
        levelXBow = (TextView) findViewById(R.id.max_level_x_bow);
        levelInfernoTower = (TextView) findViewById(R.id.max_level_inferno_tower);

        seekBar.setOnSeekBarChangeListener(seekBarListener);

        seekBar.setMax(building.getLevelMax() - 1);

        //{lvl, hp, buildCost, buildTime, xp, maxBuildingsNumber}
        image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), getResources().getIdentifier("@drawable/" + building.getNameCode() + 1, null, getPackageName())));
        name.setText(building.getName());
        level.setText(property[0]);
        hp.setText(property[1]);
        buildCost.setText(property[2] + " or");
        buildTime.setText(property[3]);
        xp.setText(property[4]);
//        ------
        numberDarkBarack.setText(maxNumberArmy[0]);
        numberBarrack.setText(maxNumberArmy[1]);
        numberArmyCamp.setText(maxNumberArmy[2]);
        numberLab.setText(maxNumberArmy[3]);
        numberSpellFactory.setText(maxNumberArmy[4]);
        numberDarkSpellFactory.setText(maxNumberArmy[5]);
        numberBarbarianKingAltar.setText(maxNumberArmy[6]);
        numberArcherQueenAltar.setText(maxNumberArmy[7]);
        numberClanCastle.setText(maxNumberArmy[8]);
        levelDarkBarack.setText(maxLevelArmy[0]);
        levelBarrack.setText(maxLevelArmy[1]);
        levelArmyCamp.setText(maxLevelArmy[2]);
        levelLab.setText(maxLevelArmy[3]);
        levelSpellFactory.setText(maxLevelArmy[4]);
        levelDarkSpellFactory.setText(maxLevelArmy[5]);
        levelBarbarianKingAltar.setText(maxLevelArmy[6]);
        levelArcherQueenAltar.setText(maxLevelArmy[7]);
        levelClanCastle.setText(maxLevelArmy[8]);
//        ------
        numberGoldMine.setText(maxNumberResource[0]);
        numberElixirCollector.setText(maxNumberResource[1]);
        numberDarkElixirDrill.setText(maxNumberResource[2]);
        numberGoldStorage.setText(maxNumberResource[3]);
        numberElixirStorage.setText(maxNumberResource[4]);
        numberDarkElixirStorage.setText(maxNumberResource[5]);
        levelGoldMine.setText(maxLevelResource[0]);
        levelElixirCollector.setText(maxLevelResource[1]);
        levelDarkElixirDrill.setText(maxLevelResource[2]);
        levelGoldStorage.setText(maxLevelResource[3]);
        levelElixirStorage.setText(maxLevelResource[4]);
        levelDarkElixirStorage.setText(maxLevelResource[5]);
//        ------
        numberCannon.setText(maxNumberDefense[0]);
        numberArcherTower.setText(maxNumberDefense[1]);
        numberWall.setText(maxNumberDefense[2]);
        numberMortar.setText(maxNumberDefense[3]);
        numberBomb.setText(maxNumberDefense[4]);
        numberAirDefense.setText(maxNumberDefense[5]);
        numberAirSweeper.setText(maxNumberDefense[6]);
        numberSpring.setText(maxNumberDefense[7]);
        numberWizardTower.setText(maxNumberDefense[8]);
        numberGiantBomb.setText(maxNumberDefense[9]);
        numberAirBomb.setText(maxNumberDefense[10]);
        numberSeekingAirMine.setText(maxNumberDefense[11]);
        numberSkeleton.setText(maxNumberDefense[12]);
        numberHiddenTesla.setText(maxNumberDefense[13]);
        numberXBow.setText(maxNumberDefense[14]);
        numberInfernoTower.setText(maxNumberDefense[15]);
        levelCannon.setText(maxLevelDefense[0]);
        levelArcherTower.setText(maxLevelDefense[1]);
        levelWall.setText(maxLevelDefense[2]);
        levelMortar.setText(maxLevelDefense[3]);
        levelBomb.setText(maxLevelDefense[4]);
        levelAirDefense.setText(maxLevelDefense[5]);
        levelAirSweeper.setText(maxLevelDefense[6]);
        levelSpring.setText(maxLevelDefense[7]);
        levelWizardTower.setText(maxLevelDefense[8]);
        levelGiantBomb.setText(maxLevelDefense[9]);
        levelAirBomb.setText(maxLevelDefense[10]);
        levelSeekingAirMine.setText(maxLevelDefense[11]);
        levelSkeleton.setText(maxLevelDefense[12]);
        levelHiddenTesla.setText(maxLevelDefense[13]);
        levelXBow.setText(maxLevelDefense[14]);
        levelInfernoTower.setText(maxLevelDefense[15]);
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
            property = building.getProperty(progress + 1);
            maxNumberArmy = building.getNumberOfArmyBuildings(progress + 1);
            maxLevelArmy = building.getLevelOfArmyBuildings(progress+1);
            maxNumberResource = building.getNumberOfResourceBuildings(progress + 1);
            maxLevelResource = building.getLevelOfResourceBuildings(progress + 1);
            maxNumberDefense = building.getNumberOfDefenseBuildings(progress + 1);
            maxLevelDefense = building.getLevelOfDefenseBuildings(progress + 1);

            image.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), getResources().getIdentifier("@drawable/" + building.getNameCode()+(progress+1), null, getPackageName())));
            level.setText(property[0]);
            hp.setText(property[1]);
            buildCost.setText(property[2] + " or");
            buildTime.setText(property[3]);
            xp.setText(property[4]);
//            ------
            numberDarkBarack.setText(maxNumberArmy[0]);
            numberBarrack.setText(maxNumberArmy[1]);
            numberArmyCamp.setText(maxNumberArmy[2]);
            numberLab.setText(maxNumberArmy[3]);
            numberSpellFactory.setText(maxNumberArmy[4]);
            numberDarkSpellFactory.setText(maxNumberArmy[5]);
            numberBarbarianKingAltar.setText(maxNumberArmy[6]);
            numberArcherQueenAltar.setText(maxNumberArmy[7]);
            numberClanCastle.setText(maxNumberArmy[8]);
            levelDarkBarack.setText(maxLevelArmy[0]);
            levelBarrack.setText(maxLevelArmy[1]);
            levelArmyCamp.setText(maxLevelArmy[2]);
            levelLab.setText(maxLevelArmy[3]);
            levelSpellFactory.setText(maxLevelArmy[4]);
            levelDarkSpellFactory.setText(maxLevelArmy[5]);
            levelBarbarianKingAltar.setText(maxLevelArmy[6]);
            levelArcherQueenAltar.setText(maxLevelArmy[7]);
            levelClanCastle.setText(maxLevelArmy[8]);
//            ------
            numberGoldMine.setText(maxNumberResource[0]);
            numberElixirCollector.setText(maxNumberResource[1]);
            numberDarkElixirDrill.setText(maxNumberResource[2]);
            numberGoldStorage.setText(maxNumberResource[3]);
            numberElixirStorage.setText(maxNumberResource[4]);
            numberDarkElixirStorage.setText(maxNumberResource[5]);
            levelGoldMine.setText(maxLevelResource[0]);
            levelElixirCollector.setText(maxLevelResource[1]);
            levelDarkElixirDrill.setText(maxLevelResource[2]);
            levelGoldStorage.setText(maxLevelResource[3]);
            levelElixirStorage.setText(maxLevelResource[4]);
            levelDarkElixirStorage.setText(maxLevelResource[5]);
//            ------
            numberCannon.setText(maxNumberDefense[0]);
            numberArcherTower.setText(maxNumberDefense[1]);
            numberWall.setText(maxNumberDefense[2]);
            numberMortar.setText(maxNumberDefense[3]);
            numberBomb.setText(maxNumberDefense[4]);
            numberAirDefense.setText(maxNumberDefense[5]);
            numberAirSweeper.setText(maxNumberDefense[6]);
            numberSpring.setText(maxNumberDefense[7]);
            numberWizardTower.setText(maxNumberDefense[8]);
            numberGiantBomb.setText(maxNumberDefense[9]);
            numberAirBomb.setText(maxNumberDefense[10]);
            numberSeekingAirMine.setText(maxNumberDefense[11]);
            numberSkeleton.setText(maxNumberDefense[12]);
            numberHiddenTesla.setText(maxNumberDefense[13]);
            numberXBow.setText(maxNumberDefense[14]);
            numberInfernoTower.setText(maxNumberDefense[15]);
            levelCannon.setText(maxLevelDefense[0]);
            levelArcherTower.setText(maxLevelDefense[1]);
            levelWall.setText(maxLevelDefense[2]);
            levelMortar.setText(maxLevelDefense[3]);
            levelBomb.setText(maxLevelDefense[4]);
            levelAirDefense.setText(maxLevelDefense[5]);
            levelAirSweeper.setText(maxLevelDefense[6]);
            levelSpring.setText(maxLevelDefense[7]);
            levelWizardTower.setText(maxLevelDefense[8]);
            levelGiantBomb.setText(maxLevelDefense[9]);
            levelAirBomb.setText(maxLevelDefense[10]);
            levelSeekingAirMine.setText(maxLevelDefense[11]);
            levelSkeleton.setText(maxLevelDefense[12]);
            levelHiddenTesla.setText(maxLevelDefense[13]);
            levelXBow.setText(maxLevelDefense[14]);
            levelInfernoTower.setText(maxLevelDefense[15]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
