package enterprise.sample.com.repeat_in_5_seconds_and_not_after_closing_app;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the Handler object (on the main thread by default)
        Handler handler = new Handler();
// Define the code block to be executed
        Runnable runnableCode = new Runnable() {
            @Override
            public void run() {
                // Do something here on the main thread
                Toast.makeText(MainActivity.this, "Repeat in 5 seconds, and not in background after closing app", Toast.LENGTH_SHORT).show();
            }
        };
// Run the above code block on the main thread after 5 seconds
        handler.postDelayed(runnableCode, 5000);
    }
}

