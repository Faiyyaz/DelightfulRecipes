package com.khatri.delightfulrecipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Faiyyaz on 25-Sep-16.
 */
public class Vstarters extends AppCompatActivity {

    private Button jain,nj,italian,mexican,burger,fastfood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vstarters);
        jain=(Button)findViewById(R.id.jain);
        nj=(Button)findViewById(R.id.nj);
        italian=(Button)findViewById(R.id.italian);
        mexican=(Button)findViewById(R.id.mexican);
        burger=(Button)findViewById(R.id.burger);
        fastfood=(Button)findViewById(R.id.fastfood);

        jain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jain=new Intent(getApplicationContext(),Vjainstarters.class);
                startActivity(jain);
            }
        });
        nj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nj=new Intent(getApplicationContext(),NonJainStarters.class);
                startActivity(nj);
            }
        });
        italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent italian=new Intent(getApplicationContext(),ComingSoon.class);
                startActivity(italian);
            }
        });
        mexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mexican=new Intent(getApplicationContext(),ComingSoon.class);
                startActivity(mexican);
            }
        });
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent burger=new Intent(getApplicationContext(),ComingSoon.class);
                startActivity(burger);
            }
        });
        fastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fastfood=new Intent(getApplicationContext(),ComingSoon.class);
                startActivity(fastfood);
            }
        });
    }
}