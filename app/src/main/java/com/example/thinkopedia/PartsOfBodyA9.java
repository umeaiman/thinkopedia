package com.example.thinkopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.thinkopedia.R.layout.activity_pob9;

public class PartsOfBodyA9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(activity_pob9);

        Button b = (Button) findViewById(R.id.lips);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBtn2();
            }
        });

        Button bTeeth = (Button) findViewById(R.id.teeth);

        bTeeth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });

    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(PartsOfBodyA9.this, MainActivity.class));
        finish(); }

    public void openDialogBtn2(){
        Wrong wrong = new Wrong();
        wrong.show(getSupportFragmentManager(), "abc");

    }

    public void openDialog(){
        CPob9 correct = new CPob9();
        correct.show(getSupportFragmentManager(), "correct");

    }



    public void onClick(View view) {
//        Cat click
//        openDialogBtn2();
    }
}
