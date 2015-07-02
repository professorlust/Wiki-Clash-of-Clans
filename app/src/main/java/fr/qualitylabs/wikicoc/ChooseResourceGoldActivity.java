package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class ChooseResourceGoldActivity extends AppCompatActivity {

    Toolbar toolbar;

    Building building = new Building();

    CardView goldmine;
    CardView goldstorage;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_resource_gold);

        // On redéfinit la ToolBar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        // Active et rend visible le bouton Home (de la ActionBar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        goldmine = (CardView) findViewById(R.id.goldmine);
        goldstorage = (CardView) findViewById(R.id.goldstorage);

        goldmine.setOnClickListener(goldmineListener);
        goldstorage.setOnClickListener(goldstorageListener);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_choose_resource_gold, menu);
//        return true;
//    }

    private View.OnClickListener goldmineListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeResourceMineActivity.class);
            building = new GoldMine();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };

    private View.OnClickListener goldstorageListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), DescribeResourceStorageActivity.class);
            building = new GoldStorage();
            intent.putExtra("building", building);
            startActivity(intent);
        }
    };
}
