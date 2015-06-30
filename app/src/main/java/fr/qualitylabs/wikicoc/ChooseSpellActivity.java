package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;


public class ChooseSpellActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    Spell spell = new Spell();

    CardView lightning;
    CardView healing;
    CardView rage;
    CardView jump;
    CardView freeze;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_spell);

//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lightning = (CardView) findViewById(R.id.lightning);
        healing = (CardView) findViewById(R.id.healing);
        rage = (CardView) findViewById(R.id.rage);
        jump = (CardView) findViewById(R.id.jump);
        freeze = (CardView) findViewById(R.id.freeze);

        lightning.setOnClickListener(lightningListener);
//        healing.setOnClickListener(healingListener);
//        rage.setOnClickListener(rageListener);
//        jump.setOnClickListener(jumpListener);
//        freeze.setOnClickListener(freezeListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_spell, menu);
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

    private View.OnClickListener lightningListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeSpellLightningActivity.class);
            spell = new LightningSpell();
            intent.putExtra("spell", spell);
            startActivity(intent);
        }
    };
}
