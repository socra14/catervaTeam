package com.recycler.socra.recycler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fabianatr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabianatr);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true );



        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_micon_round);
    }

    public void clickfabi(View view){
        Intent intent = new Intent(fabianatr.this,fabian_activity.class);
        startActivity(intent);
    }
}
