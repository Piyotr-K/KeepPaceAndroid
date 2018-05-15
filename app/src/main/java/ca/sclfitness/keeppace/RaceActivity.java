package ca.sclfitness.keeppace;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race);

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.intermediate_menu);
            ((TextView) findViewById(R.id.textView_transition_title)).setText("Just Race");

            if (getIntent().getBooleanExtra("beatTime", false))
            {
                ((TextView) findViewById(R.id.textView_transition_title)).setText("Beat your best");
            }
        }
    }

    public void onClickFive(View v) {
        startTimerIntent("5K");
    }

    public void onClickTen(View v) {
        startTimerIntent("10K");
    }

    public void onClickHalfMarathon(View v) {
        startTimerIntent("Half Marathon");
    }

    public void onClickFullMarathon(View v) {
        startTimerIntent("Full Marathon");
    }

    /**
     * Start timer activity and pass arguments for creating a race
     *
     * @param raceType - name of the race
     */
    private void startTimerIntent(String raceType) {
        Intent timerIntent = new Intent(this, TimerActivity.class);
        timerIntent.putExtra("raceType", raceType);
        timerIntent.putExtra("beatTime", getIntent().getBooleanExtra("beatTime", false));
        startActivity(timerIntent);
    }
}
