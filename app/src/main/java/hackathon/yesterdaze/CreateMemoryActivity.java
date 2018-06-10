package hackathon.yesterdaze;

import android.content.Context;
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
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//import com.google.firebase.database.DatabaseReference;

/**
 * Created by angielee on 6/9/18.
 */

public class CreateMemoryActivity extends AppCompatActivity {

    private TextView memText;
    private EditText memDate;
    private RatingBar memRating;
    private Button addButton;

    private Date myDate;

    //private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_memory_page);

        memText = (TextView) findViewById(R.id.memoryText);
        memDate = (EditText) findViewById(R.id.memoryDate);
        memRating = (RatingBar) findViewById(R.id.memoryRating);

        addButton = (Button)findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String memoryText = memText.getText().toString();
//
//                Calendar c = Calendar.getInstance();
//                c.setTime(myDate);
//                int day = c.get(Calendar.DAY_OF_MONTH);
//                int month = c.get(Calendar.MONTH);
//                int year = c.get(Calendar.YEAR);
//                String dateStr = day + "-" + month + "-" + year;

                int memoryRating = memRating.getNumStars();

                String datevalue = memDate.getText().toString();

                Memory newMem = new Memory(memoryText, datevalue, memoryRating);


                //addToDatabase();


                showSuccessMsg();

                goToMainPage();
            }
        });

    }


//    public void addToDatabase(String memId, Memory newMem) {
//        final FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference ref = database.getReference("Memory/");
//
//        DatabaseReference memoriesRef = ref.child("");
//
//        Map<String, Memory> memories = new HashMap<>();
//        users.put(memId, newMem);
//
//        usersRef.setValueAsync(memories);
//    }


    /**
     * Show success message
     */
    public void showSuccessMsg() {
        Context context = getApplicationContext();
        CharSequence text = "Successfully recorded! :)";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    /**
     * Go back to home page
     */
    public void goToMainPage() {
        Intent createMemIntent = new Intent(CreateMemoryActivity.this, MainActivity.class);
        startActivity(createMemIntent);
    }


}
