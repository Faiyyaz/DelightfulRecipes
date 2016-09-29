package com.khatri.delightfulrecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button vstarters,nvstarters,vegmaincourse,nonvegmaincourse,rice,dessert,salad,occassion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vstarters=(Button)findViewById(R.id.vstarters);
        nvstarters=(Button)findViewById(R.id.nvstarters);
        vegmaincourse=(Button)findViewById(R.id.vmcourse);
        nonvegmaincourse=(Button)findViewById(R.id.nvmcourse);
        rice=(Button)findViewById(R.id.rice);
        dessert=(Button)findViewById(R.id.dessert);
        salad=(Button)findViewById(R.id.salad);
        occassion=(Button)findViewById(R.id.occassion);

        vstarters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vstarters=new Intent(getApplicationContext(),Vstarters.class);
                startActivity(vstarters);
            }
        });
        nvstarters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nvstarters=new Intent(getApplicationContext(),Nvstarters.class);
                startActivity(nvstarters);
            }
        });
        vegmaincourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vegmaincourse=new Intent(getApplicationContext(),Vegmaincourse.class);
                startActivity(vegmaincourse);
            }
        });
        nonvegmaincourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nonvegmaincourse=new Intent(getApplicationContext(),Nonvegmaincourse.class);
                startActivity(nonvegmaincourse);
            }
        });
        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rice=new Intent(getApplicationContext(),Rice.class);
                startActivity(rice);
            }
        });
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessert=new Intent(getApplicationContext(),Dessert.class);
                startActivity(dessert);
            }
        });
        salad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salad=new Intent(getApplicationContext(),Salad.class);
                startActivity(salad);
            }
        });
        occassion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent occassion=new Intent(getApplicationContext(),Occasion.class);
                startActivity(occassion);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);//Menu Resource, Menu
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                Intent about=new Intent(getApplicationContext(),About.class);
                startActivity(about);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
