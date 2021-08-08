package com.project.loginandregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Helpdesk extends AppCompatActivity {
Button button;
Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpdesk);
        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
        addListenerOnButton5();


    }



    private void addListenerOnButton() {

    button = (Button) findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:8131800189"));
                startActivity(callIntent);
            }
        });
    }

    private void addListenerOnButton1() {
        button1 = (Button) findViewById(R.id.b2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9383062545"));
                startActivity(callIntent);

    }
        });
    }
    private void addListenerOnButton2() {
        button1 = (Button) findViewById(R.id.buttonp1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9856432142"));
                startActivity(callIntent);

            }
        });
    }
    private void addListenerOnButton3() {
        button1 = (Button) findViewById(R.id.buttonp2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:9856475211"));
                startActivity(callIntent);

            }
        });
    }
    private void addListenerOnButton4() {
        button1 = (Button) findViewById(R.id.buttonp3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:8752414214"));
                startActivity(callIntent);

            }
        });
    }
    private void addListenerOnButton5() {
        button1 = (Button) findViewById(R.id.buttonp4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:8887524411"));
                startActivity(callIntent);

            }
        });
    }



}