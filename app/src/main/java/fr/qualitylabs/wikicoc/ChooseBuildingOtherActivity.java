package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class ChooseBuildingOtherActivity extends AppCompatActivity {

    Toolbar toolbar;
    CardView townHall;
    CardView clanCastle;
    CardView decoration;
    CardView obstacle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_building_other);

        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        townHall = (CardView) findViewById(R.id.town_hall);
        clanCastle = (CardView) findViewById(R.id.clan_castle);
        decoration = (CardView) findViewById(R.id.decoration);
        obstacle = (CardView) findViewById(R.id.obstacle);

        townHall.setOnClickListener(townHallListener);
//        clanCastle.setOnClickListener(clanCastleListener);
//        decoration.setOnClickListener(decorationListener);
//        obstacle.setOnClickListener(obstacleListener);
    }

    private View.OnClickListener townHallListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), DescribeBuildingOtherTownHallActivity.class));
        }
    };
}
