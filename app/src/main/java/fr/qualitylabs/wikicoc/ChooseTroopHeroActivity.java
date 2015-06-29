package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;


public class ChooseTroopHeroActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    CardView barbarianKing;
    CardView archerQueen;

    Troop troop = new Troop();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_troop_hero);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        barbarianKing = (CardView) findViewById(R.id.barbarian_king);
        archerQueen = (CardView) findViewById(R.id.archer_queen);

        barbarianKing.setOnClickListener(barbarianKingListener);
        archerQueen.setOnClickListener(archerQueenListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_troop_hero, menu);
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

    private View.OnClickListener barbarianKingListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopBarbarianKingActivity.class);
            troop = new BarbarianKing();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener archerQueenListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopArcherQueenActivity.class);
            troop = new ArcherQueen();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };
}
