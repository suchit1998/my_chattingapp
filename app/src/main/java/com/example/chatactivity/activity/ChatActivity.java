package com.example.chatactivity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.chatactivity.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class ChatActivity extends AppCompatActivity {

    String senderUID;
    EditText messagebox;
    CardView sendbtn;
    Context context;
    DatabaseReference databaseReference;


    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        context =ChatActivity.this;
        database = FirebaseDatabase.getInstance();


        databaseReference = FirebaseDatabase.getInstance().getReference("user");

        sendbtn = findViewById(R.id.sendbtn);
        messagebox = findViewById(R.id.messagebox);






        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message=messagebox.getText().toString();
                if (message.isEmpty())
                {
                    Toast.makeText(context, "please type the message", Toast.LENGTH_SHORT).show();
                    return;
                }
                messagebox.setText("");
                Date date = new Date();

                Messages messages = new Messages();
            }
        });
    }


}