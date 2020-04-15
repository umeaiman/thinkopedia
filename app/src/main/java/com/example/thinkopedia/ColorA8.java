package com.example.thinkopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.thinkopedia.R.layout.activity_c8;

public class ColorA8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(activity_c8);

        Button b = (Button) findViewById(R.id.grey);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBtn2();
            }
        });

        Button bBla = (Button) findViewById(R.id.black);

        bBla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ColorA8.this, MainActivity.class));
        finish(); }

    public void openDialogBtn2(){
        Wrong wrong = new Wrong();
        wrong.show(getSupportFragmentManager(), "abc");

    }

    public void openDialog(){
        Cc8 correct = new Cc8();
        correct.show(getSupportFragmentManager(), "correct");

    }



    public void onClick(View view) {
//        Cat click
//        openDialogBtn2();
    }
}
