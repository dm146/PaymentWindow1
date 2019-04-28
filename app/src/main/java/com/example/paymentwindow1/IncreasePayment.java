package com.example.paymentwindow1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IncreasePayment extends AppCompatActivity {

    private Button but1; //button to go back, id=backbutton2
    private Button but2; //button to go to update page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_increase_payment);

       // back button
        but1 = (Button)findViewById(R.id.backbutton2);
        but1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openMainAcitivity();
            }
        });

        //update button
        but2 = (Button)findViewById(R.id.updateIncreasebutton);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_update_page();
            }
        });

    }
        //open main page
        public void openMainAcitivity(){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }

        //open updated page
        public void openactivity_update_page(){
            Intent intent2 = new Intent(this,Updated.class);
            startActivity(intent2);
        }


}
