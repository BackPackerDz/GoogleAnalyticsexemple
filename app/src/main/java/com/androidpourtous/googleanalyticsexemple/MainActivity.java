package com.androidpourtous.googleanalyticsexemple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.analytics.HitBuilders;


public class MainActivity extends AppCompatActivity
    implements View.OnClickListener {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

        // Pour que nous sachions de quelle endroit viennent nos cliques
        App.tracker.setScreenName("Main Screen");
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.button:

                /**
                 * Ici nous envoyons un événement à Google Analytics comme quoi
                 *  il y a eu un clique.
                 *  Vous pouvez mettre ce que vous voulez comme paramètre, à vous de voir ce qui vous arrange
                 */
                App.tracker.send(new HitBuilders.EventBuilder()
                        .setCategory("UX")
                        .setAction("Clique")
                        .setLabel("Bouton 1")
                        .build());


                break;

            case R.id.button2:

                App.tracker.send(new HitBuilders.EventBuilder()
                        .setCategory("UX")
                        .setAction("Clique")
                        .setLabel("Bouton 2")
                        .build());


                break;

            case R.id.button3:

                App.tracker.send(new HitBuilders.EventBuilder()
                        .setCategory("UX")
                        .setAction("Clique")
                        .setLabel("Bouton 3")
                        .build());


                break;
        }

    }


}
