package com.example.thinkopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.thinkopedia.R.layout.activity_parts_of_body;

public class PartsOfBodyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(activity_parts_of_body);

        Button b = (Button) findViewById(R.id.nose);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBtn2();
            }
        });

        Button bEyes = (Button) findViewById(R.id.eyes);

        bEyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(PartsOfBodyActivity.this, MainActivity.class));
        finish(); }

    public void openDialogBtn2(){
        Wrong wrong = new Wrong();
        wrong.show(getSupportFragmentManager(), "abc");

    }

    public void openDialog(){
        CPob1 correct = new CPob1();
        correct.show(getSupportFragmentManager(), "correct");

    }

    public void onClick(View view) {
//        Cat click
//        openDialogBtn2();
    }
}
