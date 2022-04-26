package com.example.chatactivity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.chatactivity.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SignUpActivity extends AppCompatActivity {

    private EditText name, mobileno, email, pass;
    private Button submit;

    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.name);
        mobileno = findViewById(R.id.mobileno);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("user");
                String Name = name.getText().toString();
                String Mobileno = mobileno.getText().toString();
                String Email = email.getText().toString();
                String Pass = pass.getText().toString();

                UserModel userModel = new UserModel(Name, Mobileno, Email, Pass);
                FirebaseDatabase.getInstance().getReference().child("user").child(Mobileno).setValue(userModel);


                Intent intent = new Intent(SignUpActivity.this, UserActivity.class);
                startActivity(intent);


            }
        });

    }
}