package fr.qualitylabs.wikiclashofclans;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class HomeActivity extends ActionBarActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !
    RelativeLayout troupesB;
    RelativeLayout troupesN;
    RelativeLayout batiments;
    CardView cardTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        //        Initialisation et définition du Drawer
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer); // Initialisation du Drawer
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar); // Définit les actions, paramètres, méthodes... du Drawer

        troupesB = (RelativeLayout) findViewById(R.id.troupes_b_bouton);
        troupesN = (RelativeLayout) findViewById(R.id.troupes_n_bouton);
        batiments = (RelativeLayout) findViewById(R.id.batiments_bouton);
        cardTest = (CardView) findViewById(R.id.card_view);

        troupesB.setOnClickListener(troupesBListener);
        troupesN.setOnClickListener(troupesNListener);
        batiments.setOnClickListener(batimentsListener);
        cardTest.setOnClickListener(cardTestListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            startActivity(new Intent(this, AboutActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener troupesBListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(HomeActivity.this, "Choisir une troupe banche", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), ChooseTroopBActivity.class));
        }
    };

    private View.OnClickListener troupesNListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(HomeActivity.this, "Choisir une troupe noire", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(), ChooseTroopNActivity.class));
        }
    };

    private View.OnClickListener batimentsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(HomeActivity.this, "Choisir un bâtiment", Toast.LENGTH_SHORT).show();
        }

    };

    private View.OnClickListener cardTestListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(getApplicationContext(), DescribeTroopBActivity.class);
            intent.putExtra("key", "barbare");
            startActivity(intent);

        }
    };
}
