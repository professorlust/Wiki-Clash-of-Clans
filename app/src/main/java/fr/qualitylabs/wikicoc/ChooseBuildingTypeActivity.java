package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class ChooseBuildingTypeActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    Building building = new Building();

    CardView defense;
    CardView trap;
    CardView army;
    CardView other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_building_type);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        defense = (CardView) findViewById(R.id.defense);
        trap = (CardView) findViewById(R.id.trap);
        army = (CardView) findViewById(R.id.army);
        other = (CardView) findViewById(R.id.other);

        defense.setOnClickListener(defenseListener);
        trap.setOnClickListener(trapListener);
        army.setOnClickListener(armyListener);
        other.setOnClickListener(otherListener);
    }

    private View.OnClickListener defenseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseBuildingDefenseActivity.class));
        }
    };

    private View.OnClickListener trapListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseBuildingTrapActivity.class));
        }
    };

    private View.OnClickListener armyListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseBuildingArmyActivity.class));
        }
    };

    private View.OnClickListener otherListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseBuildingOtherActivity.class));
        }
    };
}
