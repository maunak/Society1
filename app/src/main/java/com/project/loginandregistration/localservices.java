package com.project.loginandregistration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class localservices extends AppCompatActivity {

    private Spinner spinner_issue,spinner_sub,spinner_block, spinner_flatnumber;
    private Spinner spinner_da,spinner_ti;
    Button btn;
    EditText phone,time,date,multiline;

    FirebaseDatabase database;
    DatabaseReference reference;

    ArrayList<String> arrayList_issue;
    ArrayAdapter<String> arrayAdapter_issue;

    ArrayList<String> arrayList_electricals,arrayList_plumbing;
    ArrayAdapter<String> arrayAdapter_sub;

    ArrayList<String> arrayList_block;
    ArrayAdapter<String> arrayAdapter_block;

    ArrayList<String> arrayList_a,arrayList_b,arrayList_c,arrayList_d,arrayList_e,arrayList_f,arrayList_g;
    ArrayAdapter<String> arrayAdapter_flatnumber;

    ArrayList<String> arrayList_da;
    ArrayAdapter<String> arrayAdapter_da;
    ArrayList<String> arrayList_ti;
    ArrayAdapter<String> arrayAdapter_ti;





    Services services;
    int maxid = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localservices);



        spinner_issue =(Spinner)findViewById(R.id.spinner_issue);
        spinner_sub =(Spinner)findViewById(R.id.spinner_sub);
        spinner_block =(Spinner)findViewById(R.id.spinner_block);
        spinner_flatnumber =(Spinner)findViewById(R.id.spinner_flatnumber);
        phone = (EditText)findViewById(R.id.editTextPhone);
        spinner_da =(Spinner)findViewById(R.id.editTextDate);
        spinner_ti =(Spinner)findViewById(R.id.spinner_time);
        multiline = (EditText)findViewById(R.id.editTextTextMultiLine);
        btn = findViewById(R.id.button);

        services = new Services();
        reference = database.getInstance().getReference().child("Complaint");

        arrayList_da=new ArrayList<>();
        arrayList_da.add("Monday");
        arrayList_da.add("Tuesday");
        arrayList_da.add("Wednesday");
        arrayList_da.add("Thursday");
        arrayList_da.add("Friday");
        arrayList_da.add("Saturday");
        arrayList_da.add("Sunday");

        arrayList_ti=new ArrayList<>();
        arrayList_ti.add("9:00 AM");
        arrayList_ti.add("9:30 AM");
        arrayList_ti.add("10:00 AM");
        arrayList_ti.add("10:30 AM");
        arrayList_ti.add("11:00 AM");
        arrayList_ti.add("11:30 AM");
        arrayList_ti.add("12:00 PM");
        arrayList_ti.add("12:30 PM");
        arrayList_ti.add("1:00 PM");
        arrayList_ti.add("1:30 PM");
        arrayList_ti.add("2:00 PM");
        arrayList_ti.add("2:30 PM");
        arrayList_ti.add("3:00 PM");

        arrayAdapter_da=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_da);
        spinner_da.setAdapter(arrayAdapter_da);
        arrayAdapter_ti=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_ti);
        spinner_ti.setAdapter(arrayAdapter_ti);


        arrayList_issue=new ArrayList<>();
        arrayList_issue.add("Electrical");
        arrayList_issue.add("Plumbing");

        arrayAdapter_issue=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_issue);
        spinner_issue.setAdapter(arrayAdapter_issue);

        arrayList_electricals=new ArrayList<>();
        arrayList_electricals.add("Frequent Electrical Surges");
        arrayList_electricals.add("Sags and Dips in Power");
        arrayList_electricals.add("Light Switches not working properly");
        arrayList_electricals.add("Circuit Breaker Tripping Frequently");
        arrayList_electricals.add("Circuit Overload");
        arrayList_electricals.add("Lights Too Bright or Dim");
        arrayList_electricals.add("Electrical Shocks");
        arrayList_electricals.add("Light bublbs burning out too often");
        arrayList_electricals.add("MCB Issue");

        arrayList_plumbing=new ArrayList<>();
        arrayList_plumbing.add("Dripping Faucets");
        arrayList_plumbing.add("Low Water Pressure ");
        arrayList_plumbing.add("Running Toilet");
        arrayList_plumbing.add("Leaky Pipes");
        arrayList_plumbing.add("Slow or Clogged Drains");

        arrayList_block=new ArrayList<>();
        arrayList_block.add("A");
        arrayList_block.add("B");
        arrayList_block.add("C");
        arrayList_block.add("D");
        arrayList_block.add("E");
        arrayList_block.add("F");
        arrayList_block.add("G");


        arrayAdapter_block=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_block);
        spinner_block.setAdapter(arrayAdapter_block);

        arrayList_a=new ArrayList<>();
        arrayList_a.add("01");
        arrayList_a.add("02");
        arrayList_a.add("03");
        arrayList_a.add("04");
        arrayList_a.add("11");
        arrayList_a.add("12");
        arrayList_a.add("13");
        arrayList_a.add("14");
        arrayList_a.add("21");
        arrayList_a.add("22");
        arrayList_a.add("23");
        arrayList_a.add("24");
        arrayList_a.add("31");
        arrayList_a.add("32");
        arrayList_a.add("33");
        arrayList_a.add("34");

        arrayList_b=new  ArrayList<>();
        arrayList_b.add("01");
        arrayList_b.add("02");
        arrayList_b.add("03");
        arrayList_b.add("04");
        arrayList_b.add("11");
        arrayList_b.add("12");
        arrayList_b.add("13");
        arrayList_b.add("14");
        arrayList_b.add("21");
        arrayList_b.add("22");
        arrayList_b.add("23");
        arrayList_b.add("24");
        arrayList_b.add("31");
        arrayList_b.add("32");
        arrayList_b.add("33");
        arrayList_b.add("34");

        arrayList_c=new ArrayList<>();
        arrayList_c.add("01");
        arrayList_c.add("02");
        arrayList_c.add("03");
        arrayList_c.add("04");
        arrayList_c.add("11");
        arrayList_c.add("12");
        arrayList_c.add("13");
        arrayList_c.add("14");
        arrayList_c.add("21");
        arrayList_c.add("22");
        arrayList_c.add("23");
        arrayList_c.add("24");
        arrayList_c.add("31");
        arrayList_c.add("32");
        arrayList_c.add("33");
        arrayList_c.add("34");

        arrayList_d=new ArrayList<>();
        arrayList_d.add("01");
        arrayList_d.add("02");
        arrayList_d.add("03");
        arrayList_d.add("04");
        arrayList_d.add("11");
        arrayList_d.add("12");
        arrayList_d.add("13");
        arrayList_d.add("14");
        arrayList_d.add("21");
        arrayList_d.add("22");
        arrayList_d.add("23");
        arrayList_d.add("24");
        arrayList_d.add("31");
        arrayList_d.add("32");
        arrayList_d.add("33");
        arrayList_d.add("34");

        arrayList_e=new ArrayList<>();
        arrayList_e.add("01");
        arrayList_e.add("02");
        arrayList_e.add("03");
        arrayList_e.add("04");
        arrayList_e.add("11");
        arrayList_e.add("12");
        arrayList_e.add("13");
        arrayList_e.add("14");
        arrayList_e.add("21");
        arrayList_e.add("22");
        arrayList_e.add("23");
        arrayList_e.add("24");
        arrayList_e.add("31");
        arrayList_e.add("32");
        arrayList_e.add("33");
        arrayList_e.add("34");

        arrayList_f=new ArrayList<>();
        arrayList_f.add("01");
        arrayList_f.add("02");
        arrayList_f.add("03");
        arrayList_f.add("04");
        arrayList_f.add("11");
        arrayList_f.add("12");
        arrayList_f.add("13");
        arrayList_f.add("14");
        arrayList_f.add("21");
        arrayList_f.add("22");
        arrayList_f.add("23");
        arrayList_f.add("24");
        arrayList_f.add("31");
        arrayList_f.add("32");
        arrayList_f.add("33");
        arrayList_f.add("34");

        arrayList_g=new ArrayList<>();
        arrayList_g.add("01");
        arrayList_g.add("02");
        arrayList_g.add("03");
        arrayList_g.add("04");
        arrayList_g.add("11");
        arrayList_g.add("12");
        arrayList_g.add("13");
        arrayList_g.add("14");
        arrayList_g.add("21");
        arrayList_g.add("22");
        arrayList_g.add("23");
        arrayList_g.add("24");
        arrayList_g.add("31");
        arrayList_g.add("32");
        arrayList_g.add("33");
        arrayList_g.add("34");



        spinner_issue.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    arrayAdapter_sub=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_electricals);
                }
                if(position==1)
                {
                    arrayAdapter_sub=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_plumbing);
                }
                spinner_sub.setAdapter(arrayAdapter_sub);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner_block.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    arrayAdapter_flatnumber=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_a);
                }
                if(position==1)
                {
                    arrayAdapter_flatnumber=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_b);
                }
                if(position==2)
                {
                    arrayAdapter_flatnumber=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_c);
                }
                if(position==3)
                {
                    arrayAdapter_flatnumber=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_d);
                }
                if(position==4)
                {
                    arrayAdapter_flatnumber=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_e);
                }
                if(position==5)
                {
                    arrayAdapter_flatnumber=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,arrayList_f);
                }
                spinner_flatnumber.setAdapter(arrayAdapter_flatnumber);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()) {
                    maxid = (int) snapshot.getChildrenCount();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                services.setIssue(spinner_issue.getSelectedItem().toString());
                services.setSubIssue(spinner_sub.getSelectedItem().toString());
                services.setBlock(spinner_block.getSelectedItem().toString());
                services.setFlat(spinner_flatnumber.getSelectedItem().toString());
                services.setPhone(phone.getText().toString());
                services.setDate(spinner_da.getSelectedItem().toString());
                
                services.setTime(spinner_ti.getSelectedItem().toString());

                services.setDetail(multiline.getText().toString());

                Toast.makeText(localservices.this, "Issue Submitted", Toast.LENGTH_SHORT).show();

                reference.child(String.valueOf(maxid+1)).setValue(services);
            }
        });


    }


}