package com.recycler.socra.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class emi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true );



        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_micon_round);
    }
}
