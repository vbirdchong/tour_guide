package com.example.cccho.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        final ArrayList<TourInfo> tourInfos = new ArrayList<TourInfo>();
        tourInfos.add(new TourInfo(getString(R.string.string_event_g20),
                getString(R.string.string_event_g20_addtion),
                R.drawable.g20));

        tourInfos.add(new TourInfo(getString(R.string.string_event_marathon),
                getString(R.string.string_event_marathon_addtion),
                R.drawable.marathon));

        TourInfoAdapter tourInfoAdapter = new TourInfoAdapter(this, tourInfos);
        ListView listView = (ListView) findViewById(R.id.id_info_list);
        listView.setAdapter(tourInfoAdapter);
    }
}
