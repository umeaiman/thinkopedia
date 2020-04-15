package com.example.thinkopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import android.os.AsyncTask;
//import android.util.Log;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintWriter;
public class MainActivity extends AppCompatActivity {
    private long backPressedTime;

    private Button b;
    private Button bColor;
    private Button bPOB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.btnBirds);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birdsAct();
            }

        });
//        Colour work
        Button bColor = (Button) findViewById(R.id.colorsBtn);
        bColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorsAct();
            }

        });

//        /        Parts of body work
        Button bPOB = (Button) findViewById(R.id.pobBtn);
        bPOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                partsOfBodyAct();
            }

        });

    }
/*
    @Override
    public void onBackPressed() {
        super.onBackPressed();
//        startActivity(new Intent(MainActivity.this, animalActivity.class));
        finish();
//        super.onBackPressed();
//        Toast.makeText(MainActivity.this,"There is no back action",Toast.LENGTH_LONG).show();
//        return;
//            super.onBackPressed();
//        if (backPressedTime + 2000 > System.currentTimeMillis()){
//            Toast.makeText(MainActivity.this,"There is no back action",Toast.LENGTH_LONG).show();
//            super.onBackPressed();


//        } else{
//            Toast.makeText(getBaseContext(), "Press back again to exit.",Toast.LENGTH_SHORT).show();
//        }
//        backPressedTime = System.currentTimeMillis();

    }
*/
    public void openDialog(){
        Correct correct = new Correct();
        correct.show(getSupportFragmentManager(), "correct");

    }
    public void birdsDQ1(){
        Cb1 correct = new Cb1();
        correct.show(getSupportFragmentManager(), "correct");

    }
    public void openDialogBtn2(){
        Wrong wrong = new Wrong();
        wrong.show(getSupportFragmentManager(), "abc");

    }

    public void onClick(View view) {

        /*
       TextView text = (TextView) findViewById(R.id.txt);
        text.setText("Next Question....");
       */

//        BackgroundTask b = new BackgroundTask();
//        b.execute();


        question2Ani();

        if (true) {
           // openDialog();
        }

        //question3Ani();

        //if (true) {
            // openDialog();
        //}
/*
    question2Ani();
        Button b = (Button)findViewById(R.id.button2);
        String buttonText = b.getText().toString();
        if (buttonText == "M"){
            openDialog();

        }
*/

    }
    public void question2Ani(){
        Intent intent = new Intent(this, animalActivity.class);
        startActivity(intent);
    }
    public void birdsAct(){
        Intent intent = new Intent(this, birdActivity.class);
        startActivity(intent);
    }
    public void colorsAct(){
        Intent intent = new Intent(this, ColorActivity.class);
        startActivity(intent);
    }
    public void partsOfBodyAct(){
        Intent intent = new Intent(this, PartsOfBodyActivity.class);
        startActivity(intent);
    }

    //public void question3Ani(){
        //Intent i = new Intent(this, birdActivity.class);
        //startActivity(i);
    //}

//    class BackgroundTask extends AsyncTask<String,Void,String>
//    {
//        Socket s;
//        DataOutputStream dos;
//        String ip,message;
//        @Override
//        protected String doInBackground(String... params) {
//            try{
//                s = new Socket("192.168.1.33",1337);
//                dos = new DataOutputStream(s.getOutputStream());
//                dos.writeUTF("hello");
//                dos.close();
//                s.close();
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//
//
//            return null;
//        }
//    }
}










/*
public class MainActivity extends AppCompatActivity {
    //private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button b = (Button) findViewById(R.id.button);

        //b.setOnClickListener(new View.OnClickListener() {
        //   @Override
        //  public void onClick(View view) {
        //     openDialogBtn2();
        // }
        // });
    }


    public void openDialog() {
        Correct correct = new Correct();
        correct.show(getSupportFragmentManager(), "correct");

    }

    public void openDialogBtn2() {
        Wrong wrong = new Wrong();
        wrong.show(getSupportFragmentManager(), "abc");

    }


    public void onClick(View view) {
//Socket s = null;
        //TextView text = (TextView) findViewById(R.id.txt);
        // text.setText("Next Question....");
//         s = new Socket("192.168", 80);
//        InputStream in = socket.getInputStream();

//        int data = in.read();
//... read more data...

        //        in.close();
//        socket.close();
//BackgroundTask b = new BackgroundTask();
//b.execute();
//b.getStatus();
        question2Ani();
        if (true) {
//        openDialog();
        }

        question3Ani();
       if (true) {
//        openDialog();
        }
//    question2Ani();

//        Button b = (Button)findViewById(R.id.button2);
//        String buttonText = b.getText().toString();
//        if (buttonText == "M"){
//            openDialog();
//
//        }

        public void question2Ani(); {
            Intent intent = new Intent(this, animalActivity.class);
            startActivity(intent);
        }

        public void question3Ani () {
            Intent a = new Intent(this, birdActivity.class);
            startActivity(a);
        }
    }
}*/


/*
    class BackgroundTask extends AsyncTask<String,Void,String>
    {
Socket s;
DataOutputStream dos;
String ip,message;
        @Override
        protected String doInBackground(String... params) {
            try{
                s = new Socket("192.168.0.108",9000);
                dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF("hello from client side");

                PrintWriter printWriter = new PrintWriter(s.getOutputStream());
                printWriter.write("your message");
                Log.e("Messagge","Its output");
                printWriter.flush();
                printWriter.close();
                s.close();


                dos.close();
                s.close();
            }catch(IOException e){
                e.printStackTrace();
            }


            return null;
        }
    }
}
*/
