package com.example.scrollingapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        List<String> popularPlaces = Arrays.asList(new String[]{"London, England", "Bangkok, Thailand", "Paris, France", "Dubai, United Arab Emirates", "Istanbul, Turkey", "New York City, USA", "Singapore", "Kuala Lumpur, Malaysia", "Seoul, South Korea", "Hong Kong, China"});
        RecyclerView firstRecyclerView = findViewById(R.id.firstRecyclerView);
        LinearLayoutManager firstLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        firstRecyclerView.setLayoutManager(firstLayoutManager);
        PlaceItemAdapter firstAdapter = new PlaceItemAdapter(popularPlaces);
        DividerItemDecoration firstDecoration = new DividerItemDecoration(firstRecyclerView.getContext(), RecyclerView.VERTICAL);
        firstRecyclerView.addItemDecoration(firstDecoration);
        firstRecyclerView.setAdapter(firstAdapter);

        List<String> richestPeople = Arrays.asList(new String[]{"Jeff Bezos", "Bill Gates", "Bernard Arnault", "Warren Buffett", "Mark Zuckerberg", "Amancio Ortega", "Larry Ellison", "Carlos Slim Helu"});
        RecyclerView secondRecyclerView = findViewById(R.id.secondRecyclerView);
        LinearLayoutManager secondLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        secondRecyclerView.setLayoutManager(secondLayoutManager);
        PlaceItemAdapter secondAdapter = new PlaceItemAdapter(richestPeople);
        DividerItemDecoration secondDecoration = new DividerItemDecoration(firstRecyclerView.getContext(), RecyclerView.VERTICAL);
        secondRecyclerView.addItemDecoration(secondDecoration);
        secondRecyclerView.setAdapter(secondAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
