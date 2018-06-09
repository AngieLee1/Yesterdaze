package hackathon.yesterdaze;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by angielee on 6/9/18.
 */

public class CreateMemoryActivity extends AppCompatActivity {

    TextView memText;
    EditText memDate;
    RatingBar memRating;
    Button nextButton;

    Date myDate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_memory_page);


        nextButton = (Button) findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memText = (TextView) findViewById(R.id.memoryText);
                memDate = (EditText) findViewById(R.id.memoryDate);
                memRating = (RatingBar) findViewById(R.id.memoryRating);

                String memoryText = memText.getText().toString();

                Calendar c = Calendar.getInstance();
                c.setTime(myDate);
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);
                String dateStr = day + "-" + month + "-" + year;

                int memoryRating = memRating.getNumStars();

                Memory newMem = new Memory(memoryText, dateStr, memoryRating);

                goToMainPage();
            }
        });

    }


    /**
     * Switch to the CreateMemoryActivity
     */
    public void goToMainPage() {
        Intent createMemIntent = new Intent(CreateMemoryActivity.this, MainActivity.class);
        startActivity(createMemIntent);
    }


}
