package com.example.cccho.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView historicalSite = (TextView) findViewById(R.id.id_historical_site);
        historicalSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historicalSiteIntent = new Intent(MainActivity.this, HistoricalsiteActivity.class);
                startActivity(historicalSiteIntent);
            }
        });
    }
}
