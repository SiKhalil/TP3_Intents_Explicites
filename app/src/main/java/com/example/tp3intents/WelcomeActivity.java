package com.example.tp3intents;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView welcom;
    String welcomenom;
    String welcomeprenom;
    String welcomemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom_activity);

        welcom = (TextView) findViewById(R.id.welcom);

        welcomenom = getIntent().getExtras().getString("name");
        welcomeprenom = getIntent().getExtras().getString("lastname");
        welcomemail = getIntent().getExtras().getString("mymail");

        welcom.setText("Bienvenue " + welcomenom + " " + welcomeprenom + ", "
                + "c'est la deuxième activité. "
                + "Vous serez bientôt contacté sur : " + welcomemail);
    }
}
