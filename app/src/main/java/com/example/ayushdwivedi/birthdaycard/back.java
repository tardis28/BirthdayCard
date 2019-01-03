package com.example.ayushdwivedi.birthdaycard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class back extends AppCompatActivity {
    TextView outtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        outtext=findViewById(R.id.view1);

        String text1= getIntent().getStringExtra("text");
        outtext.setText(text1);
    }
}
