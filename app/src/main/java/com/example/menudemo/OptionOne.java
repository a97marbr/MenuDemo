package com.example.menudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class OptionOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_one);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.main_option_main:
                Log.d("==>", "Selected option main");

                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.main_option_1:
                Log.d("==>", "Selected option 1");

                intent = new Intent(this,OptionOne.class);
                startActivity(intent);
                return true;
            case R.id.main_option_2:
                Log.d("==>", "Selected option 2");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}