package com.khatri.delightfulrecipes;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.khatri.delightfulrecipes.database.DB_Parse;
import com.khatri.delightfulrecipes.database.DB_Recipe;

/**
 * Created by Faiyyaz on 26-Sep-16.
 */
public class ChickenStarters extends AppCompatActivity {

    protected ListView lv;
    protected ListAdapter adapter;
    SQLiteDatabase db;
    Cursor cursor;
    EditText et_db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vjainstarters);
        db = (new DB_Recipe(this)).getWritableDatabase();
        lv = (ListView) findViewById(R.id.lv);
        et_db = (EditText) findViewById(R.id.et);

        try {
            cursor = db.rawQuery("SELECT * FROM nonvegstarters ORDER BY name ASC", null);
            adapter = new SimpleCursorAdapter(this, R.layout.isi_lv, cursor,
                    new String[] { "name", "ingredient", "img" }, new int[] {
                    R.id.tv_name, R.id.tvIngredient, R.id.imV });
            lv.setAdapter(adapter);
            lv.setTextFilterEnabled(true);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View v,
                                        int position, long id) {
                    detail(position);

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("deprecation")
    public void search_db(View v) {
        String edit_db = et_db.getText().toString();
        if (!edit_db.equals("")) {
            try {
                cursor = db.rawQuery("SELECT * FROM nonvegstarters WHERE name LIKE ?",
                        new String[] { "%" + edit_db + "%" });
                adapter = new SimpleCursorAdapter(
                        this,
                        R.layout.isi_lv,
                        cursor,
                        new String[] { "name", "ingredient", "img" },
                        new int[] { R.id.tv_name, R.id.tvIngredient, R.id.imV });
                if (adapter.getCount() == 0) {
                    Toast.makeText(
                            this,
                            "No data found by keywords " + edit_db
                                    + "", Toast.LENGTH_SHORT).show();
                } else {
                    lv.setAdapter(adapter);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                cursor = db.rawQuery("SELECT * FROM nonvegstarters ORDER BY name ASC",
                        null);
                adapter = new SimpleCursorAdapter(
                        this,
                        R.layout.isi_lv,
                        cursor,
                        new String[] { "name", "ingredient", "img" },
                        new int[] { R.id.tv_name, R.id.tvIngredient, R.id.imV });
                lv.setAdapter(adapter);
                lv.setTextFilterEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void detail(int position) {
        int im = 0;
        String _id = "";
        String name = "";
        String ingredient = "";
        String method = "";
        if (cursor.moveToFirst()) {
            cursor.moveToPosition(position);
            im = cursor.getInt(cursor.getColumnIndex("img"));
            name = cursor.getString(cursor.getColumnIndex("name"));
            ingredient = cursor.getString(cursor.getColumnIndex("ingredient"));
            method = cursor.getString(cursor.getColumnIndex("method"));
        }

        Intent iIntent = new Intent(this, DB_Parse.class);
        iIntent.putExtra("dataIM", im);
        iIntent.putExtra("dataName", name);
        iIntent.putExtra("dataIngredient", ingredient);
        iIntent.putExtra("dataMethod", method);
        setResult(RESULT_OK, iIntent);
        startActivityForResult(iIntent, 99);
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
