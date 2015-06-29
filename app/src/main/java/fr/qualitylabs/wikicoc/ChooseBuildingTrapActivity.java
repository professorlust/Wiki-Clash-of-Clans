package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;


public class ChooseBuildingTrapActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    Building building = new Building();

    CardView bomb;
    CardView spring;
    CardView airBomb;
    CardView seekingAirMine;
    CardView giantBomb;
    CardView skeleton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_building_trap);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bomb = (CardView) findViewById(R.id.bomb);
        spring = (CardView) findViewById(R.id.spring);
        airBomb = (CardView) findViewById(R.id.air_bomb);
        seekingAirMine = (CardView) findViewById(R.id.seeking_air_mine);
        giantBomb = (CardView) findViewById(R.id.giant_bomb);
        skeleton = (CardView) findViewById(R.id.skeleton);

        bomb.setOnClickListener(bombListener);
        spring.setOnClickListener(springListener);
        airBomb.setOnClickListener(airBombListener);
        seekingAirMine.setOnClickListener(seekingAirMineListener);
        giantBomb.setOnClickListener(giantBombListener);
        skeleton.setOnClickListener(skeletonListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_building_trap, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        return super.onOptionsItemSelected(item);
//    }

    private View.OnClickListener bombListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingTrapActivity.class);
            building = new Bomb();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener springListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingTrapSpringActivity.class);
            building = new Spring();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener airBombListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingTrapActivity.class);
            building = new AirBomb();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener seekingAirMineListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingTrapActivity.class);
            building = new SeekingAirMine();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener giantBombListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingTrapGiantBombActivity.class);
            building = new GiantBomb();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener skeletonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingTrapSkeletonActivity.class);
            building = new Skeleton();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };
}
