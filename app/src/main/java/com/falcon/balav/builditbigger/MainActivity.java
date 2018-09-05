package com.falcon.balav.builditbigger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.falcon.balav.lib.Jokes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        Jokes jokes = new Jokes ();
        String joke = jokes.tellAJoke ();
        TextView textViewJoke = (TextView) findViewById(R.id.JokeText);
        textViewJoke.setText (joke);
    }
}
