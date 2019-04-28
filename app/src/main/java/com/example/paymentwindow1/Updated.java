package com.example.paymentwindow1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Updated extends AppCompatActivity {

    private Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updated);

        //***** peters button to go to maps here

        //button to go back to main page here
        but1 = (Button) findViewById(R.id.backhome);
        but1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openactivity_main_page();
            }
        });
    }

    //method to open update page
    public void openactivity_main_page() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
