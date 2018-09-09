package com.falcon.balav.lib;


import java.util.ArrayList;
import java.util.Random;



public class Jokes {
//http://www.columbia.edu/itc/mealac/pritchett/00urduhindilinks/txt_akbar_birbal.html
    //http://redtri.com/best-jokes-for-kids/
public static final String TAG = Jokes.class.getSimpleName ();

    ArrayList <String> alJokes = new ArrayList<>();
    public Jokes(){
        alJokes.add("Q. What do you call a droid that likes taking the scenic route? A. R2-Detour!");
        alJokes.add("Q: Why are all of Superman’s costumes tight? A: They’re all size S.");
        alJokes.add ("What do you call a dinosaur that is sleeping?\n" +
                "\n" +
                "A dino-snore");
        alJokes.add ("Why did the teddy bear say no to dessert?\n" +
                "\n" +
                "Because she was stuffed");
        alJokes.add("What did the left eye say to the right eye?\n" +
                "\n" +
                "Between us, something smells!");
        alJokes.add("What do you get when you cross a vampire and a snowman?\n" +
                "\n" +
                "Frost bite!");

    }

    public String tellAJoke(){
        Random rand = new Random ();
        int x = rand.nextInt (alJokes.size ());
       System.out.println ("x -->"+x);
        return alJokes.get (x);
    }
}
