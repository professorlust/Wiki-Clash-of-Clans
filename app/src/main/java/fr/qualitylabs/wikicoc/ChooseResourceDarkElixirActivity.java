package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;


public class ChooseResourceDarkElixirActivity extends AppCompatActivity {

    Toolbar toolbar;

    Building building = new Building();

    CardView darkelixirdrill;
    CardView darkelixirstorage;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_resource_dark_elixir);

        // On redéfinit la ToolBar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        // Active et rend visible le bouton Home (de la ActionBar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        darkelixirdrill = (CardView) findViewById(R.id.darkelixirdrill);
        darkelixirstorage = (CardView) findViewById(R.id.darkelixirstorage);

        darkelixirdrill.setOnClickListener(darkelixirdrillListener);
        darkelixirstorage.setOnClickListener(darkelixirstorageListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_resource_dark_elixir, menu);
        return true;
    }

    private View.OnClickListener darkelixirdrillListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeResourceMineActivity.class);
            building = new DarkElixirDrill();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener darkelixirstorageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeResourceStorageActivity.class);
            building = new DarkElixirStorage();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };
}
