package fr.qualitylabs.wikicoc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;


public class HomeActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    VideoView drawer_video;

    CardView troop;
    CardView batiments;
    CardView resources;
    CardView spells;

    // Google Analytics Trackers
    public static GoogleAnalytics analytics;
    public static Tracker tracker;

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

        drawer_video = (VideoView) findViewById(R.id.drawer_video);
        troop = (CardView) findViewById(R.id.troop);
        batiments = (CardView) findViewById(R.id.buildings);
        resources = (CardView) findViewById(R.id.resources);
        spells = (CardView) findViewById(R.id.spells);

        drawer_video.setVideoURI(Uri.parse("android.resource://fr.qualitylabs.wikicoc/" + R.raw.drawer));
        drawer_video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        drawer_video.start();
        troop.setOnClickListener(troopListener);
        batiments.setOnClickListener(batimentsListener);
        resources.setOnClickListener(resourcesListener);
        spells.setOnClickListener(spellsListener);

        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(1800);

        tracker = analytics.newTracker("UA-45228515-2"); //ID Google Analytics
        tracker.enableExceptionReporting(true);
        tracker.enableAdvertisingIdCollection(true);
        tracker.enableAutoActivityTracking(true);

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

    private View.OnClickListener troopListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseTroopTypeActivity.class));
        }
    };

    private View.OnClickListener batimentsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getApplicationContext(), ChooseBuildingTypeActivity.class));
        }

    };

    private View.OnClickListener resourcesListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Section bientôt disponible", Toast.LENGTH_LONG).show();        }

    };

    private View.OnClickListener spellsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "Section bientôt disponible", Toast.LENGTH_LONG).show();        }

    };
}
