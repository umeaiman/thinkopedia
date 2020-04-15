package com.example.thinkopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.thinkopedia.R.layout.activity_bird;

public class birdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(activity_bird);

        Button b = (Button) findViewById(R.id.pigeon);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBtn2();
            }
        });

        Button bCrow = (Button) findViewById(R.id.crow);

        bCrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(birdActivity.this, MainActivity.class));
        finish(); }

    public void openDialogBtn2(){
        Wrong wrong = new Wrong();
        wrong.show(getSupportFragmentManager(), "abc");

    }

    public void openDialog(){
        Cb1 correct = new Cb1();
        correct.show(getSupportFragmentManager(), "correct");
    }

    public void onClick(View view) {
//        Cat click
//        openDialogBtn2();
    }
}