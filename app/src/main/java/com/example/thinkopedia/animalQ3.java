package com.example.thinkopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class animalQ3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_q3);

        Button b = (Button) findViewById(R.id.button4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBtn2();
            }
        });

        Button bGir = (Button) findViewById(R.id.button5);

        bGir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

    }/*
    private long backPressedTime;
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        } else{
            Toast.makeText(getBaseContext(), "Press back again to exit.",Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();

    } */
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(animalQ3.this, MainActivity.class));
        finish(); }

    public void openDialogBtn2(){
        Wrong wrong = new Wrong();
        wrong.show(getSupportFragmentManager(), "abc");

    }

    public void openDialog(){
        CorrectQ3 correct = new CorrectQ3();
        correct.show(getSupportFragmentManager(), "correct");

    }



    public void onClick(View view) {
//        Cat click
//        openDialogBtn2();
    }
}
