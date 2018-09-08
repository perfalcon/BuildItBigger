package com.falcon.balav.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.falcon.balav.jokedisplay.JokeActivity;
import com.falcon.balav.lib.Jokes;

public class MainActivityFragment extends Fragment implements View.OnClickListener{
    public static final String TAG = MainActivityFragment.class.getSimpleName ();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Button currentButton = (Button) rootView.findViewById(R.id.btn_Joke);

        Log.v(TAG,"Setting Listener on Button");
        currentButton.setOnClickListener (this);

        return rootView;
    }


    public void launchJokeActivity() {
        Intent intent = new Intent (getParentFragment ().getContext (),JokeActivity.class);
        Jokes  jokeSource = new Jokes ();
        String joke = jokeSource.tellAJoke ();
        intent.putExtra(JokeActivity.JOKE_KEY, joke);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        Button pressedButton = (Button) v;
        Log.v(TAG, "Pressed Button-->"+pressedButton.toString ());
        Log.v(TAG,"Button ID -->"+pressedButton.getId ());
        if(pressedButton.getId() == R.id.btn_Joke){
            launchJokeActivity();
        }
    }
}
