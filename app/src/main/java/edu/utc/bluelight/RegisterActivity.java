package edu.utc.bluelight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button advanceToPin = (Button) findViewById(R.id.Register);
        advanceToPin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(RegisterActivity.this , pinActivity.class);
                startActivity(intent);
            }

        });



        TextView termsText = (TextView) findViewById(R.id.termsLink);
        termsText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                RegisterActivity.this.startActivity(new Intent(RegisterActivity.this, TermsActivity.class));

            }
        });
    }
}
