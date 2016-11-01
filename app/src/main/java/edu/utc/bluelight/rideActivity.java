package edu.utc.bluelight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride);

        Button advanceToConfirm = (Button) findViewById(R.id.rideSubmitBtn);
        advanceToConfirm.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(rideActivity.this , rideConfirm.class);
                startActivity(intent);
            }

        });

        Button CancelConfirm = (Button) findViewById(R.id.rideCancelBtn);
        CancelConfirm.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(rideActivity.this , choiceActivity.class);
                startActivity(intent);
            }

        });


    }
}
