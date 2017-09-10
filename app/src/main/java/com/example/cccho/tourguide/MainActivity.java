package com.example.cccho.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView historicalSite = (TextView) findViewById(R.id.id_historical_site);
        historicalSite.setOnClickListener(this);

        TextView restaurants = (TextView) findViewById(R.id.id_restaurants);
        restaurants.setOnClickListener(this);

        TextView events = (TextView) findViewById(R.id.id_event);
        events.setOnClickListener(this);

        TextView traffic = (TextView) findViewById(R.id.id_traffic);
        traffic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        Intent intent = null;
        switch (id) {
            case R.id.id_historical_site:
                intent = new Intent(MainActivity.this, HistoricalsiteActivity.class);
                break;
            case R.id.id_event:
                intent = new Intent(MainActivity.this, EventActivity.class);
                break;
            case R.id.id_traffic:
                intent = new Intent(MainActivity.this, TrafficActivity.class);
                break;
            case R.id.id_restaurants:
                intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                break;
            default:
                Log.e("MainActivity", "onClick id error: " + id);
                break;
        }

        startActivity(intent);
    }
}
