package com.khatri.delightfulrecipes.database;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import com.khatri.delightfulrecipes.R;

/**
 * Created by Faiyyaz on 25-Sep-16.
 */

public class DB_Parse extends AppCompatActivity {

    ImageView Im;
    TextView tv_name, tv_ingredient, tv_method, id;
    Gallery gallery;
    ImageSwitcher imageSwitcher;
    Integer[] imageIDs = new Integer[3];
    int msg_im;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receipe);
        Intent intent = getIntent();
        msg_im = intent.getIntExtra("dataIM", 0);
        String msg_name = intent.getStringExtra("dataName");
        String msg_ingredient = intent.getStringExtra("dataIngredient");
        String msg_method = intent.getStringExtra("dataMethod");
        Im = (ImageView) findViewById(R.id.iv_detail);
        tv_name = (TextView) findViewById(R.id.tvName);
        tv_ingredient = (TextView) findViewById(R.id.tvIngredient);
        tv_method = (TextView) findViewById(R.id.tvMethod);
        Im.setImageResource(msg_im);
        tv_name.setText(msg_name);
        tv_ingredient.setText(msg_ingredient);
        tv_method.setText(msg_method);
    }
}
