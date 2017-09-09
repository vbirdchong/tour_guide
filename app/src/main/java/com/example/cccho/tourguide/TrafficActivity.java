package com.example.cccho.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TrafficActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        final ArrayList<TourInfo> tourInfos = new ArrayList<TourInfo>();
        tourInfos.add(new TourInfo(getString(R.string.string_traffic_airport),
                getString(R.string.string_traffic_airport_addtion),
                R.drawable.airport));

        tourInfos.add(new TourInfo(getString(R.string.string_traffic_railway),
                getString(R.string.string_traffic_railway_addtion),
                R.drawable.railway_station));

        tourInfos.add(new TourInfo(getString(R.string.string_traffic_metro),
                getString(R.string.string_traffic_metro_addtion),
                R.drawable.metro));

        TourInfoAdapter tourInfoAdapter = new TourInfoAdapter(this, tourInfos);
        ListView listView = (ListView) findViewById(R.id.id_info_list);
        listView.setAdapter(tourInfoAdapter);
    }
}
