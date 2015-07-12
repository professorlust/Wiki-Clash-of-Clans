package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


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
            Intent intent = new Intent(getApplicationContext(), DescribeResourceStorageActivity.class);
            building = new ElixirStorage();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };
}
