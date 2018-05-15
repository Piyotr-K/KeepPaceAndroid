package ca.sclfitness.keeppace;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CrunchPaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crunch_pace);

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.intermediate_menu);
            ((TextView) findViewById(R.id.textView_transition_title)).setText("Crunch Pace");
        }
    }

    public void onClickFullCrunch(View v) {
        Intent i = new Intent(this, PaceActivity.class);
        i.putExtra("type", 2);    // grind pace
        startActivity(i);
    }

    public void onClickStairCrunch(View v) {
        Intent i = new Intent(this, PaceActivity.class);
        i.putExtra("type", 3);    // crunch pace
        startActivity(i);
    }
}
