package com.technoabinash.customtoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //define toolbar
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find tool bar
        toolbar = findViewById(R.id.main_toolbar);
        //set tool bar on action bar before this go to theme and set theme as a no action bar
        setSupportActionBar(toolbar);

    }

    //just initialize menu item which we created on resiurse menu folder
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    // set content what we need when our menu item was clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home_menu:
                Toast.makeText(this, "home clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting_menu:
                Toast.makeText(this, "setting clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout_menu:
                Toast.makeText(this, "logout clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about_menu:
                Toast.makeText(this, "about clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}