package com.example.chatactivity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.chatactivity.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseActivity extends AppCompatActivity {
    EditText name,mail;
    FirebaseAuth firebaseAuth;
    FirebaseStorage firebaseStorage;
    String userid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
        name = findViewById(R.id.name);
        mail = findViewById(R.id.mail);

        //firebaseAuth = FirebaseAuth.getInstance();
     //   firebaseStorage = FirebaseStorage.getInstance();

     //   userid = firebaseAuth.getCurrentUser().getUid();



    }
}