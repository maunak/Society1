package com.project.loginandregistration;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONException;
import org.json.JSONObject;

public class Billpayment extends AppCompatActivity implements PaymentResultListener {
    Button buttonpay1;
    Button buttonpay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billpayment);

        buttonpay1 = findViewById(R.id.button2);
        buttonpay2 = findViewById(R.id.buttonpaym);

        String sAmount= "100";
        int amount = Math.round(Float.parseFloat(sAmount)*100);

        buttonpay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Checkout checkout = new Checkout();
                checkout.setKeyID("rzp_test_s1VETeyF3YrONk");
                JSONObject object = new JSONObject();
                try {
                    object.put("name", "Society Works");
                    object.put("Description", "Test Payment");
                    object.put("Currency","INR");
                    object.put("Amount",amount);
                    object.put("prefill.contact", "9140448185");
                    object.put("prefill.contact", "projectcollege50@gmail.com");
                    checkout.open( Billpayment.this,object);

                }catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        buttonpay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Checkout checkout = new Checkout();
                checkout.setKeyID("rzp_test_s1VETeyF3YrONk");
                JSONObject object = new JSONObject();
                try {
                    object.put("name", "Society Works");
                    object.put("Description", "Test Payment");
                    object.put("Currency","INR");
                    object.put("Amount",amount);
                    object.put("prefill.contact", "9140448185");
                    object.put("prefill.contact", "projectcollege50@gmail.com");
                    checkout.open( Billpayment.this,object);

                }catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void onPaymentSuccess(String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Payment ID");
        builder.setMessage(s);
        builder.show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Toast.makeText(getApplicationContext()
                ,s,Toast.LENGTH_SHORT).show();

    }
}