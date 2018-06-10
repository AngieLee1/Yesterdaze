package hackathon.yesterdaze;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView name;
    private Button createMemButton;
    private Button showMemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        createMemButton = (Button) findViewById(R.id.create_mem_button);
        showMemButton = (Button) findViewById(R.id.show_mem_button);

        createMemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToCreateMemory();
            }
        });

        showMemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToRandomMemory();
            }
        });

    }


    /**
     * Switch to the CreateMemoryActivity
     */
    public void goToCreateMemory() {
        Intent createMemIntent = new Intent(MainActivity.this, CreateMemoryActivity.class);
        startActivity(createMemIntent);
    }

    /**
     * Switch to the RandomMemoryActivity
     */
    public void goToRandomMemory() {
        Intent randMemIntent = new Intent(MainActivity.this, RandomMemoryActivity.class);
        startActivity(randMemIntent);
    }

}
