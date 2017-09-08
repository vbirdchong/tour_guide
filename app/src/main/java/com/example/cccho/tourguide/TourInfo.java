package com.example.cccho.tourguide;

/**
 * Created by cccho on 2017/9/8.
 */

public class TourInfo {
    private String mBaseTourInfo;
    private int mImageId = NO_IMAGE_RESOURCE;

    private static final int NO_IMAGE_RESOURCE = -1;

    public TourInfo(String baseInfo) {
        mBaseTourInfo = baseInfo;
    }

    public TourInfo(String baseInfo, int imageId) {
        mBaseTourInfo = baseInfo;
        mImageId = imageId;
    }

    public String getBaseTourInfo() {
        return mBaseTourInfo;
    }

    public int getImageId() {
        return mImageId;
    }

    public boolean hasImageResource() {
        return mImageId != NO_IMAGE_RESOURCE;
    }

}
