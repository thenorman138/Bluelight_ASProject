package edu.utc.bluelight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class choiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        //attributes for the choice to walk with a friend
        ImageButton Walkbtn = (ImageButton) findViewById(R.id.WWFbtn);

        Walkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choiceActivity.this, walkActivity.class);
                startActivity(intent);
            }
        });

        //attributes for choice to get a safe ride
        ImageButton rideBtn = (ImageButton) findViewById(R.id.SafeRidebtn);

        rideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choiceActivity.this, rideActivity.class);
                startActivity(intent);
            }
        });


        //attributes for adding a friend
        ImageButton addBtn = (ImageButton) findViewById(R.id.addFriendbtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choiceActivity.this, addFriend.class);
                startActivity(intent);
            }
        });


        //attributes for dropping a pin or sharing a location
        ImageButton dropBtn = (ImageButton) findViewById(R.id.dropSharebtn);

        Walkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choiceActivity.this, walkActivity.class);
                startActivity(intent);
            }
        });
    }
}
