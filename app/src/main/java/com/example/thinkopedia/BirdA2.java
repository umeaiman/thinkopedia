package com.example.thinkopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.thinkopedia.R.layout.activity_b_q2;

public class BirdA2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(activity_b_q2);

        Button b = (Button) findViewById(R.id.pigeon);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBtn2();
            }
        });

        Button bPen = (Button) findViewById(R.id.penguin);

        bPen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

    }

    public void openDialogBtn2(){
        Wrong wrong = new Wrong();
        wrong.show(getSupportFragmentManager(), "abc");

    }

    public void openDialog(){
        Cb2 correct = new Cb2();
        correct.show(getSupportFragmentManager(), "correct");

    }


    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(BirdA2.this, MainActivity.class));
        finish(); }


    public void onClick(View view) {
//        Cat click
//        openDialogBtn2();
    }
}
