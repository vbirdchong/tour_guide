package com.example.cccho.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cccho on 2017/9/8.
 */

public class TourInfoAdapter extends ArrayAdapter<TourInfo> {

    public TourInfoAdapter(Activity context, ArrayList<TourInfo> tourInfoList) {
        super(context, 0, tourInfoList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TourInfo tourInfo = getItem(position);

        TextView tourInfoText = (TextView) listItemView.findViewById(R.id.id_tour_info_text);
        tourInfoText.setText(tourInfo.getBaseTourInfo());

        TextView tourAdditionalInfoText = (TextView) listItemView.findViewById(R.id.id_tour_addition_info_text);
        if (tourInfo.hasAdditionalInfo()) {
            tourAdditionalInfoText.setText(tourInfo.getAdditionalInfo());
        }

        ImageView tourInfoImage = (ImageView) listItemView.findViewById(R.id.id_tour_info_image);
        if (tourInfo.hasImageResource()) {
            tourInfoImage.setImageResource(tourInfo.getImageId());
            tourInfoImage.setVisibility(View.VISIBLE);
        }

        return listItemView;
    }
}
