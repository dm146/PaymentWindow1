package com.example.paymentwindow1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button but2;



    // NOTE if card detail entry fails for invalid regex, should we go to an error page or load an error
    // and let them restart ???


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // button to go to subscription page
        button = (Button)findViewById(R.id.subscribePayButton);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                openactivity_subscription_page();
            }
        });

        //button to go to increase balance page
        but2 = (Button)findViewById(R.id.increaseBalance);
        but2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                openactivity_increase_page();
            }
        });

    }

    // method to go to subscribe page
    public void openactivity_subscription_page(){
        Intent intent = new Intent(this,SubscriptionPage.class);
        startActivity(intent);
    }

    //method to go to increase page
    public void openactivity_increase_page(){
        Intent intent2 = new Intent(this,IncreasePayment.class);
        startActivity(intent2);

    }


}
