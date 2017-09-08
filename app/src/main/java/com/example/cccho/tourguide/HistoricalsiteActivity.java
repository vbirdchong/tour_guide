package com.example.cccho.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalsiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        final ArrayList<TourInfo> tourInfos = new ArrayList<TourInfo>();
        tourInfos.add(new TourInfo(getString(R.string.string_historical_site_duanqiao), R.drawable.duanqiao));
        tourInfos.add(new TourInfo(getString(R.string.string_historical_site_leifenta), R.drawable.leifengta));
        tourInfos.add(new TourInfo(getString(R.string.string_historical_site_sudi), R.drawable.sudi));
        tourInfos.add(new TourInfo(getString(R.string.string_historical_site_xihuyinxiang), R.drawable.xihuyinxiang));

        TourInfoAdapter tourInfoAdapter = new TourInfoAdapter(this, tourInfos);
        ListView listView = (ListView) findViewById(R.id.id_info_list);
        listView.setAdapter(tourInfoAdapter);
    }
}
