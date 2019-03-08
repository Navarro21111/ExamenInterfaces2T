package com.example.manpa.noplanetb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAcceder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAcceder=findViewById(R.id.btnAcceder);
    }

    public void acceder(View view){
        Intent i= new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
