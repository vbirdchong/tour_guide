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
        tourInfos.add(new TourInfo(getString(R.string.string_restaurants_louwailou),
                                    getString(R.string.string_restaurants_louwailou_addtion),
                                    R.drawable.louwailou));

        tourInfos.add(new TourInfo(getString(R.string.string_restaurants_zhiweiguan),
                                    getString(R.string.string_restaurants_zhiweiguan_addtion),
                                    R.drawable.zhiweiguan));

        tourInfos.add(new TourInfo(getString(R.string.string_restaurants_hangzhourestaurant),
                                    getString(R.string.string_restaurants_hangzhourestaurant_addtion),
                                    R.drawable.hangzhourestaurant));

        tourInfos.add(new TourInfo(getString(R.string.string_restaurants_grandma),
                                    getString(R.string.string_restaurants_grandma_addtion),
                                    R.drawable.grandma));

        TourInfoAdapter tourInfoAdapter = new TourInfoAdapter(this, tourInfos);
        ListView listView = (ListView) findViewById(R.id.id_info_list);
        listView.setAdapter(tourInfoAdapter);
    }
}
