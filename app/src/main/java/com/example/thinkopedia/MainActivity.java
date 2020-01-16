package com.example.thinkopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBtn2();
            }
        });
    }

    public void openDialog(){
        Correct correct = new Correct();
        correct.show(getSupportFragmentManager(), "correct");

    }
    public void openDialogBtn2(){
        Wrong wrong = new Wrong();
        wrong.show(getSupportFragmentManager(), "abc");

    }

    public void onClick(View view) {

        //TextView text = (TextView) findViewById(R.id.txt);
       // text.setText("Next Question....");



    if (true) {
        openDialogBtn2();
    }
//    question2Ani();

//        Button b = (Button)findViewById(R.id.button2);
//        String buttonText = b.getText().toString();
//        if (buttonText == "M"){
//            openDialog();
//
//        }
    }
    public void question2Ani(){
        Intent intent = new Intent(this, animalQuestion2.class);
        startActivity(intent);
    }
}
