package com.example.logintts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    EditText e1, e2;
    Button b1, b2;
    String s1, s2;
    TextToSpeech ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        b1 = findViewById(R.id.login);
        b2 = findViewById(R.id.register);
        ts = new TextToSpeech(MainActivity.this,this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                if(s1.contentEquals("aryaman") && s2.contentEquals("abc1234")){
                    ts.speak("Login Successful", TextToSpeech.QUEUE_ADD, null);
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                } else{
                    ts.speak("Incorrect Username or Password", TextToSpeech.QUEUE_ADD, null);
                    Toast.makeText(MainActivity.this, "Incorrect Username or Password!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                if(s1.contentEquals("") || s2.contentEquals("")){
                    ts.speak("Fill the remaining fields!", TextToSpeech.QUEUE_ADD, null);
                    Toast.makeText(MainActivity.this, "Fill the remaining fields!", Toast.LENGTH_SHORT).show();
                } else {
                    ts.speak("User Saved Successfully", TextToSpeech.QUEUE_ADD, null);
                    Toast.makeText(MainActivity.this, "User Saved Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    @Override
    public void onInit(int i){
        ts.setLanguage(Locale.ENGLISH);
        ts.setSpeechRate(0.8f);
    }
}