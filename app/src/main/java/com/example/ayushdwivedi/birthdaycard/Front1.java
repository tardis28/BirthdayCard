package com.example.ayushdwivedi.birthdaycard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Front1 extends AppCompatActivity {

    EditText text1;
    Button Button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front1);
        text1 = findViewById(R.id.name);
        Button1 = findViewById(R.id.btn);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textt = text1.getText().toString();
                Intent i = new Intent(getApplicationContext(),back.class);
                i.putExtra("text",textt);
                startActivity(i);
            }
        });
    }
}

