package com.example.itmastertraining.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button
import android.view.View
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button b1,b2;
    private EditText ET1,ET2,ET3;
    private ListenerConfirmar listenerConfirmar;
    private ListenerReset listenerReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        ET1=findViewById(R.id.ET1);
        ET2=findViewById(R.id.ET2);
        ET3=findViewById(R.id.ET3);
        listenerConfirmar= new ListenerConfirmar(this);




    }







}
