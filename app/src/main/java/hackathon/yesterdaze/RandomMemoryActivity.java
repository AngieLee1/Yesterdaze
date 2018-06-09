package hackathon.yesterdaze;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by angielee on 6/9/18.
 */

public class RandomMemoryActivity extends AppCompatActivity {

    private TextView dateTextView;
    private TextView memoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        dateTextView = (TextView) findViewById(R.id.date_text_view);
        memoryTextView = (TextView) findViewById(R.id.memory_text_view);


        // mem = [from firebase]


        dateTextView.setText(mem.getDate());
        memoryTextView.setText(mem.getText());
    }

}
