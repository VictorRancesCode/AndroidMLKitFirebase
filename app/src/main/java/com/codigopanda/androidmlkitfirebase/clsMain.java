package com.codigopanda.androidmlkitfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class clsMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fmain);
    }

    public void MLDetectFaces(View v){
        startActivity(new Intent(this, clsMLDetectFaces.class));
    }
    public void MLLabelImages(View v){
        startActivity(new Intent(this,clsMLLabelImages.class));
    }
    public void MLTextRecognition(View v){
        startActivity(new Intent(this,clsMLTextRecognition.class));
    }

}
