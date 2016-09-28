package com.khatri.delightfulrecipes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Faiyyaz on 26-Sep-16.
 */
public class Nvstarters extends AppCompatActivity {

    private Button fish,prawns,mutton,chicken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nvstarters);
        fish=(Button)findViewById(R.id.fish);
        prawns=(Button)findViewById(R.id.prawns);
        mutton=(Button)findViewById(R.id.mutton);
        chicken=(Button)findViewById(R.id.chicken);

        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fish=new Intent(getApplicationContext(),ComingSoon.class);
                startActivity(fish);
            }
        });

        mutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mutton=new Intent(getApplicationContext(),ComingSoon.class);
                startActivity(mutton);
            }
        });
        prawns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prawns=new Intent(getApplicationContext(),ComingSoon.class);
                startActivity(prawns);
            }
        });
        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chicken=new Intent(getApplicationContext(),ChickenStarters.class);
                startActivity(chicken);
            }
        });
    }
}