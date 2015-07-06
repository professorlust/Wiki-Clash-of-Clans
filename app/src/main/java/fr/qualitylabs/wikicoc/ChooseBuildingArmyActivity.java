package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;


public class ChooseBuildingArmyActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    Building building = new Building();

    CardView barracks;
    CardView darkbarracks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_building_army);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        barracks = (CardView) findViewById(R.id.barracks);
        darkbarracks = (CardView) findViewById(R.id.darkbarracks);

        barracks.setOnClickListener(barracksListener);
        darkbarracks.setOnClickListener(darkbarracksListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_building_army, menu);
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

    //    Ouverture de l'activité DescribeBuildingDefenseWallActivity pour décrire le mur
    private View.OnClickListener barracksListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingBarracksActivity.class);
            building = new Barracks();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    //Ouverture de l'activité DescribeBuildingDefenseActivity pour décrire chaque batiment
    private View.OnClickListener darkbarracksListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeBuildingBarracksActivity.class);
            building = new DarkBarracks();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };
}