package com.example.hunter.bluelight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class walkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk);

        Button cancelWalk = (Button) findViewById(R.id.CancelBtn);
        cancelWalk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(walkActivity.this, "Message Cancelled...", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(walkActivity.this , choiceActivity.class);
                startActivity(intent);
            }

        });

        Button submitWalk = (Button) findViewById(R.id.SubmitBtn);
        submitWalk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(walkActivity.this, "Walk With Friend message sent!", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(walkActivity.this , choiceActivity.class);
                startActivity(intent);
            }

        });
    }
}
