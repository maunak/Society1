package com.project.loginandregistration;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity<onActivityCreated> extends AppCompatActivity implements View.OnClickListener{
    SharedPreferences sharedPreferences;
    public static final String fileName = "login";
    public static final String Username = "username";
    public CardView c1,c2,c3,c4,c5,c6;
    private FirebaseAuth firebaseAuth;
    private FloatingActionButton user,logout,mupdate,entry;
    Animation fabOpen,fabClose,fabClockwise,fabAnticlockwise;

    boolean isOpen = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        c1 = (CardView) findViewById(R.id.about);
        c2 = (CardView) findViewById(R.id.meetings);
        c3 = (CardView) findViewById(R.id.residentbook);
        c4 = (CardView) findViewById(R.id.billpay);
        c5 = (CardView) findViewById(R.id.localservices);
        c6 = (CardView) findViewById(R.id.helpdesk);




        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);


        firebaseAuth=FirebaseAuth.getInstance();
        logout =(FloatingActionButton) findViewById(R.id.logout);
        mupdate =(FloatingActionButton) findViewById(R.id.edit);
        user =(FloatingActionButton) findViewById(R.id.user);
        entry =(FloatingActionButton) findViewById(R.id.entry);

        fabOpen = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        fabClose = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        fabClockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        fabAnticlockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);

        sharedPreferences = getSharedPreferences(fileName, Context.MODE_PRIVATE);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isOpen){
                    mupdate.startAnimation(fabClose);
                    logout.startAnimation(fabClose);
                    user.startAnimation(fabClockwise);

                    mupdate.setClickable(false);
                    logout.setClickable(false);

                    isOpen = false;
                }
                else {
                    mupdate.startAnimation(fabOpen);
                    logout.startAnimation(fabOpen);
                    user.startAnimation(fabAnticlockwise);

                    mupdate.setClickable(true);
                    logout.setClickable(true);

                    isOpen = true;
                }
            }
        });
        mupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Profile.class));
            }
        });
        entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Entrylist.class));
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(HomeActivity.this, MainActivity.class));            }
        });


    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.about:
                i = new Intent(this, about.class);
                startActivity(i);
                break;
            case R.id.meetings:
                i=new Intent(this, Meetings.class);
                startActivity(i);
                break;
            case R.id.residentbook:
                i=new Intent(this, Residentdirectory.class);
                startActivity(i);
                break;
            case R.id.billpay:
                i=new Intent(this, Billpayment.class);
                startActivity(i);
                break;
            case R.id.localservices:
                i=new Intent(this,localservices.class);
                startActivity(i);
                break;
            case R.id.helpdesk:
                i=new Intent(this, Helpdesk.class);
                startActivity(i);
                break;

        }

    }

}
