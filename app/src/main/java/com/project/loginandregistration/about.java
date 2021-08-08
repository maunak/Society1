package com.project.loginandregistration;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

public class about extends AppCompatActivity {

    private static final int GALLERY_INTENT_CODE = 1023 ;
    TextInputLayout fullName,email,phone,block,flat;
    TextView name;
    ImageView profileImageView;
    FirebaseAuth mAuth;
    FirebaseFirestore fStore;
    String userId;
    StorageReference storageReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        phone = findViewById(R.id.phone_no_profile);
        fullName = findViewById(R.id.full_name_profile);
        email    = findViewById(R.id.email_profile);
        name    = findViewById(R.id.fullname_field);
        block    = findViewById(R.id.block);
        flat    = findViewById(R.id.flat);
        profileImageView  = findViewById(R.id.profile_image);
        storageReference = FirebaseStorage.getInstance().getReference();


        mAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        userId = mAuth.getCurrentUser().getUid();

        StorageReference profileRef = storageReference.child("users/"+mAuth.getCurrentUser().getUid()+"/profile.jpg");
        profileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(profileImageView);
            }
        });


        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                if(documentSnapshot.exists()){
                    phone.getEditText().setText(documentSnapshot.getString("PhoneNo"));
                    fullName.getEditText().setText(documentSnapshot.getString("Name"));
                    email.getEditText().setText(documentSnapshot.getString("Email"));
                    name.setText(documentSnapshot.getString("Name"));
                    block.getEditText().setText(documentSnapshot.getString("Block"));
                    flat.getEditText().setText(documentSnapshot.getString("Flat"));

                }else {
                    Log.d("tag", "onEvent: Document do not exists");
                }
            }
        });
    }
}