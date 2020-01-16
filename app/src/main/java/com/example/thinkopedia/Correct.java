package com.example.thinkopedia;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class Correct extends DialogFragment {
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Option is")
                .setMessage("Correct Answer!!!!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
//                    MainActivity  ma = new MainActivity();
//                    ma.question2Ani();
                        question2Ani();
                    }

                });
        return builder.create();
    }
    public void question2Ani(){
        Intent intent = new Intent(getContext(), animalQuestion2.class);
        startActivity(intent);
    }

}


