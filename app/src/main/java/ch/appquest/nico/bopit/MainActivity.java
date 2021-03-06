package ch.appquest.nico.bopit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton settingsBtn = findViewById(R.id.settingsBtn);
        settingsBtn.setImageResource(R.drawable.icon_settings);

        ImageButton tutorialBtn = findViewById(R.id.tutorialBtn);
        tutorialBtn.setImageResource(R.drawable.icon_help);
    }

    //Called when singleplayer button is pressed
    public void playSingleplayer(View view) {
        Intent intent = new Intent(this, SingleplayerActivity.class);
        startActivity(intent);
    }

    //Called when multiplayer button is pressed
    public void playMultiplayer(View view) {
        Intent intent = new Intent(this, MultiplayerActivity.class);
        startActivity(intent);
    }

    //Called when tutorial button is pressed
    public void showTutorial(View view) {
        Intent intent = new Intent(this, TutorialActivity.class);
        startActivity(intent);
    }

    //Called when settings button is pressed
    public void showSettings(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
