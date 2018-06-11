package pro.anant.android.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class StopwatchActivity extends Activity {
    private int seconds = 0;
    private boolean running;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
    }

    public void onClickStart(View view){
        running = true;
    }

    public void onClickStop(View view){
        running = false;
    }

    public void onClickReset(View view){
        seconds = 0;
        running = false;
    }

}
