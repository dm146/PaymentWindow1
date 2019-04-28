package com.example.paymentwindow1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class SubscriptionPage extends AppCompatActivity {

   private Button button2;
   private Button but3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription_page);

        //button to go back to main page
        button2 = (Button)findViewById(R.id.backbutton);
        button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                openMainAcitivity();
            }
        });

        //button to go tp update page
        but3 = (Button)findViewById(R.id.updatebutton);
        but3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                openactivity_update_page();
            }
        });
    }

    //method to open main page
    public void openMainAcitivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    //method to open update page
    public void openactivity_update_page(){
        Intent intent2 = new Intent(this,Updated.class);
        startActivity(intent2);
    }



}
