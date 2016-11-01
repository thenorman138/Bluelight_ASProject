package com.example.hunter.bluelight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class addFriend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend);


        Button addFriendtoList = (Button) findViewById(R.id.ConfirmAddBtn);
        addFriendtoList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(addFriend.this, "Friend Added!", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(addFriend.this, choiceActivity.class);
                startActivity(intent);
            }

        });
    }
}
