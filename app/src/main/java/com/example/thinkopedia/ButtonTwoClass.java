package com.example.thinkopedia;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonTwoClass extends MainActivity {
    private Button c;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button c = (Button) findViewById(R.id.button2);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }
    public void openDialog(){
        Def def = new Def();
        def.show(getSupportFragmentManager(), "def");

    }

}
