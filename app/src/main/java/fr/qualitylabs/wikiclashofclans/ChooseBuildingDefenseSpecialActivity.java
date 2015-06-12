package fr.qualitylabs.wikiclashofclans;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ChooseBuildingDefenseSpecialActivity extends ActionBarActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    Building building = new Building();

    CardView xBow;
    CardView airSweeper;
    CardView infernoTower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_building_defense_special);

        //        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        xBow = (CardView) findViewById(R.id.x_bow);
        airSweeper = (CardView) findViewById(R.id.air_sweeper);
        infernoTower = (CardView) findViewById(R.id.inferno_tower);

        xBow.setOnClickListener(xBowListener);
        airSweeper.setOnClickListener(airSweeperListener);
        infernoTower.setOnClickListener(infernoTowerListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_building_defense_special, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener xBowListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingDefenseSpecialActivity.class);
            building = new XBow();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener airSweeperListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingDefenseSpecialActivity.class);
            building = new AirSweeper();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener infernoTowerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingDefenseSpecialActivity.class);
            building = new InfernoTower();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };
}
