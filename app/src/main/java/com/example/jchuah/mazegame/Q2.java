package com.example.jchuah.mazegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Q2 extends AppCompatActivity {

    Bundle groceries;
    public void onCc(View source) {
        Intent Q3Intent = new Intent(this, Q3.class);
        Q3Intent.putExtra("groceries", groceries);

        startActivity(Q3Intent);
    }

    public void onClickwrong(View source) {
        Intent WrongIntent = new Intent(this, Wrong.class);
        WrongIntent.putExtra("groceries", groceries);

        startActivity(WrongIntent);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_q2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
