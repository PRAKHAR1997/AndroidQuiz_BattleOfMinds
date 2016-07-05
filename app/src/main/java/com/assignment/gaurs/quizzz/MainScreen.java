package com.assignment.gaurs.quizzz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainScreen extends AppCompatActivity {
    Button one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        one = (Button) findViewById(R.id.button);

        int score =getIntent().getIntExtra("score", 0);
        try {
            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(MainScreen.this, Level1.class);
                    startActivity(intent);
                }
            });
            if(score==0){
                Toast.makeText(MainScreen.this, "Let's Start!!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainScreen.this, "Congrats! You have scored : " + score, Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Toast.makeText(MainScreen.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}