package com.example.activity_study01;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private String tag = "my_tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button_b=findViewById(R.id.btn_b);

        Intent intent = getIntent();
        String thing = intent.getStringExtra("thing");
        TextView textView = findViewById(R.id.textview_b);
        textView.setText(thing);
        button_b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String thing = intent.getStringExtra("thing");
                Log.v(tag,thing);
                intent.putExtra("result","输入的是"+thing);
                setResult(0,intent);
                finish();
            }
        });

    }

}