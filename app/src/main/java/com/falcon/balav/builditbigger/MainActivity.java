package com.falcon.balav.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.falcon.balav.jokedisplay.JokeActivity;
import com.falcon.balav.lib.Jokes;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        Log.v("in MainActivity", "In MainActivity");

        setContentView (R.layout.activity_main);

    }

   /* public void launchJokeActivity() {
        Intent intent = new Intent (this,JokeActivity.class);
        Jokes  jokeSource = new Jokes ();
        String joke = jokeSource.tellAJoke ();
        intent.putExtra(JokeActivity.JOKE_KEY, joke);
        startActivity(intent);
    }*/
}
