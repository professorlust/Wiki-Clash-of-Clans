package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class ChooseResourceElixirActivity extends AppCompatActivity {

    Toolbar toolbar;

    Building building = new Building();

    CardView elixircollector;
    CardView elixirstorage;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_resource_elixir);

        // On redéfinit la ToolBar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        // Active et rend visible le bouton Home (de la ActionBar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        elixircollector = (CardView) findViewById(R.id.elixircollector);
        elixirstorage = (CardView) findViewById(R.id.elixirstorage);

        elixircollector.setOnClickListener(elixircollectorListener);
        elixirstorage.setOnClickListener(elixirstorageListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_resource_elixir, menu);
        return true;
    }

    private View.OnClickListener elixircollectorListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeResourceMineActivity.class);
            building = new ElixirCollector();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener elixirstorageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Section bientôt disponible", Toast.LENGTH_LONG).show();
        }
    };
}
