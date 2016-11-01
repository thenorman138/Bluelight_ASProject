package edu.utc.bluelight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class rideConfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_confirm);


        Button cancelRide = (Button) findViewById(R.id.cancelConfirmBtn);
        cancelRide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(rideConfirm.this, "Safe Ride request cancelled...", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(rideConfirm.this, choiceActivity.class);
                startActivity(intent);
            }

        });


        Button confirmRide = (Button) findViewById(R.id.confirmBtn);
        confirmRide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(rideConfirm.this, "Safe Ride request successfully submitted!", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(rideConfirm.this, choiceActivity.class);
                startActivity(intent);
            }

        });
    }





    }

