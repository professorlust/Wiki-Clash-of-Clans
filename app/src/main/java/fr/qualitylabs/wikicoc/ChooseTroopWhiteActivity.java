package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class ChooseTroopWhiteActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    CardView barbarian;
    CardView archer;
    CardView goblin;
    CardView giant;
    CardView wallbraker;
    CardView ballon;
    CardView wizard;
    CardView healer;
    CardView dragon;
    CardView pekka;

    Troop troop = new Troop();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_troop_white);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        barbarian = (CardView) findViewById(R.id.barbarian);
        archer = (CardView) findViewById(R.id.archer);
        goblin = (CardView) findViewById(R.id.goblin);
        giant = (CardView) findViewById(R.id.geant);
        wallbraker = (CardView) findViewById(R.id.wall_breaker);
        ballon = (CardView) findViewById(R.id.balloon);
        wizard = (CardView) findViewById(R.id.wizard);
        healer = (CardView) findViewById(R.id.healer);
        dragon = (CardView) findViewById(R.id.dragon);
        pekka = (CardView) findViewById(R.id.pekka);

        barbarian.setOnClickListener(barbarianistener);
        archer.setOnClickListener(archerListener);
        goblin.setOnClickListener(goblinListener);
        giant.setOnClickListener(giantListener);
        wallbraker.setOnClickListener(wallbrakerListener);
        ballon.setOnClickListener(ballonListener);
        wizard.setOnClickListener(wizardListener);
        healer.setOnClickListener(healerListener);
        dragon.setOnClickListener(dragonListener);
        pekka.setOnClickListener(pekkaListener);
    }

    //    Ouverture de l'activité DescribeTroopActivity pour décrire chaque personnage
    private View.OnClickListener barbarianistener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new Barbarian();
            intent.putExtra("troop", troop);
            startActivity(intent);

        }
    };

    private View.OnClickListener archerListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new Archer();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener goblinListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new Goblin();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener giantListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new Giant();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener wallbrakerListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new WallBreaker();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener ballonListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new Balloon();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener wizardListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new Wizard();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener healerListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new Healer();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener dragonListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new Dragon();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };

    private View.OnClickListener pekkaListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), DescribeTroopWhiteActivity.class);
            troop = new Pekka();
            intent.putExtra("troop", troop);
            startActivity(intent);
        }
    };
}
