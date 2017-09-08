package com.example.cccho.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        final ArrayList<TourInfo> tourInfos = new ArrayList<TourInfo>();
        tourInfos.add(new TourInfo(getString(R.string.string_restaurants_louwailou), R.drawable.louwailou));
        tourInfos.add(new TourInfo(getString(R.string.string_restaurants_zhiweiguan), R.drawable.zhiweiguan));
        tourInfos.add(new TourInfo(getString(R.string.string_restaurants_hangzhourestaurant), R.drawable.hangzhourestaurant));
        tourInfos.add(new TourInfo(getString(R.string.string_restaurants_grandma), R.drawable.grandma));

        TourInfoAdapter tourInfoAdapter = new TourInfoAdapter(this, tourInfos);
        ListView listView = (ListView) findViewById(R.id.id_info_list);
        listView.setAdapter(tourInfoAdapter);
    }
}
