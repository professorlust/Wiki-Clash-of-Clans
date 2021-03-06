package fr.qualitylabs.wikicoc;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;


public class AboutActivity extends AppCompatActivity {

    Toolbar toolbar; // Tool Bar provenant du package android.support.v7.widget !

    ImageButton about;
    MediaPlayer surprise;

    WebView about_description;

    TextView version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


//        On redéfinit la Tool Bar avec la nôtre
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

//        Active et rend visible le bouton Home (de la Action Bar)
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        about = (ImageButton) findViewById(R.id.about_image);

        about.setOnClickListener(aboutListener);
        surprise = MediaPlayer.create(AboutActivity.this, R.raw.surprise);
        about_description = (WebView) findViewById(R.id.about_text);

        about_description.loadUrl("file:///android_res/raw/about.html");
        about_description.setBackgroundColor(Color.TRANSPARENT);
        about_description.setOnLongClickListener(new View.OnLongClickListener() {
                                                     @Override
                                                     public boolean onLongClick(View v) {
                                                         return true;
                                                     }
                                                 }
        );
        about_description.setLongClickable(false);
        about_description.setHapticFeedbackEnabled(false);

        version = (TextView) findViewById(R.id.version);
        try {
            version.setText("version " + getPackageManager().getPackageInfo(getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) { // Si l'item cliqué est le bouton Home, syntaxe particulière de l'ID car c'est un bouton Home "générique"
            NavUtils.navigateUpFromSameTask(this); // Redirige vers le parent (indiqué dans AndroidManifest.xml) de la même application (this)
        }

        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener aboutListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            about.setBackgroundResource(R.drawable.surprise);
            surprise.start();
        }
    };
}
