package com.example.android.myappportfolio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startPopularMovies(View view) {
        //Toast.makeText(this, "This button will launch my Popular Movies app!", Toast.LENGTH_SHORT).show();
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.nadajp.popularmovies");
        if (launchIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(this, "Popular Movies app is not installed on this device.", Toast.LENGTH_LONG).show();
        }
    }

    public void startScores(View view) {
        Toast.makeText(this, "This button will launch my Scores app!", Toast.LENGTH_SHORT).show();
    }

    public void startLibrary(View view) {
        Toast.makeText(this, "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
    }

    public void startBuildIt(View view) {
        Toast.makeText(this, "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
    }

    public void startXYZ(View view) {
        Toast.makeText(this, "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
    }

    public void startCapstone(View view) {
        Toast.makeText(this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
    }
}
