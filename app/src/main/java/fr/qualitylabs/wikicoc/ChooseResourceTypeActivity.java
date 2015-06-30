package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Alex on 30/06/2015.
 */
public class ChooseResourceTypeActivity extends AppCompatActivity {

    Toolbar toolbar;  //ToolBar provenant du package android.support.v7.widget !

    Building building = new Building();

    CardView gold;
    CardView elixir;
    CardView darkelixir;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_resource_type);

        // On redéfinit la ToolBar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        // Active et rend visible le bouton Home (de la ActionBar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gold = (CardView) findViewById(R.id.gold);
        elixir = (CardView) findViewById(R.id.elixir);
        darkelixir = (CardView) findViewById(R.id.darkelixir);

        gold.setOnClickListener(goldListener);
        elixir.setOnClickListener(elixirListener);
        darkelixir.setOnClickListener(darkelixirListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_choose_resource_type, menu);
        return true;
    }

    private View.OnClickListener goldListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseResourceGoldActivity.class));
        }
    };

    private View.OnClickListener elixirListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Section bientôt disponible", Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener darkelixirListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Section bientôt disponible", Toast.LENGTH_LONG).show();
        }
    };
}
