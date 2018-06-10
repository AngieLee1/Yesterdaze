package hackathon.yesterdaze;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;

import java.util.Random;

/**
 * Created by angielee on 6/9/18.
 */

public class RandomMemoryActivity extends AppCompatActivity {

    private TextView dateTextView;
    private TextView memoryTextView;
    private ArrayList<Memory> memList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remind_page);

        dateTextView = (TextView) findViewById(R.id.date_text_view);
        memoryTextView = (TextView) findViewById(R.id.memory_text_view);


        // Get a reference to our memories
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("Memories");

        // Attach a listener to read the data at our memories reference
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Integer count = 0;
                for (DataSnapshot memSnapshot: dataSnapshot.getChildren()) {
                    Memory mem = memSnapshot.getValue(Memory.class);
                    memList.add(mem);
                    count += 1;
                }
                Random random = new Random();
                Memory randomMem = memList.get(random.nextInt(count));
                dateTextView.setText(randomMem.getDate());
                memoryTextView.setText(randomMem.getText());
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("The read failed: " + databaseError.getCode());
            }
        });
    }
}
